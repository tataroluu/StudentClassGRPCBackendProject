package com.bilgeadam.services;

import com.bilgeadam.converters.ConverterDers;
import com.bilgeadam.grpc.*;
import com.bilgeadam.models.DersModel;
import com.bilgeadam.repositorys.DersRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DersService {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

    @GrpcClient("ders-service")
    OperationServiceGrpc.OperationServiceBlockingStub blockingStub;

    public static String message;

    public List<DersModel> getAllService() {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        DersListRequest request =  DersListRequest.newBuilder().build();
        DersListResponse response = blockingStub.listDers(request);
        return ConverterDers.convertProtoDersToModelDersModelList(response.getDersList());
    }

    public boolean deleteService(int id) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        DersDeleteRequest request = DersDeleteRequest.newBuilder().setId(id).build();
        DersDeleteResponse response = blockingStub.deleteDers(request);
        return response.getIsDelete();
    }

    public boolean insertService(DersModel dersModel) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        Ders protoDers = ConverterDers.convertModelDersToProtoDers(dersModel);
        DersInsertRequest request = DersInsertRequest.newBuilder().setDers(protoDers).build();
        DersInsertResponse response = blockingStub.setDers(request);
        return response.getIsSaved();
    }

    public DersModel getByIdService(int id) {
        return DersRepository.getByIdRepository(id);
    }
}
