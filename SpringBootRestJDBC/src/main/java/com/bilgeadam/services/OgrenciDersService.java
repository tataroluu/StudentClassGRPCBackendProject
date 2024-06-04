package com.bilgeadam.services;

import com.bilgeadam.converters.ConverterOgrenciDers;
import com.bilgeadam.grpc.OgrenciDersListRequest;
import com.bilgeadam.grpc.OgrenciDersListResponse;
import com.bilgeadam.grpc.OperationServiceGrpc;
import com.bilgeadam.models.OgrenciDersModel;
import com.bilgeadam.repositorys.OgrenciDersRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciDersService {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

    @GrpcClient("ogrenci-ders-service")
    OperationServiceGrpc.OperationServiceBlockingStub blockingStub;

    public static String message;

    public List<OgrenciDersModel> getAllService() {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        OgrenciDersListRequest request = OgrenciDersListRequest.newBuilder().build();
       OgrenciDersListResponse response = blockingStub.listOgrenciDers(request);
        return ConverterOgrenciDers.convertProtoOgrenciToModelOgrenciModelListJoin(response.getOgrenciDersList());
    }

    public static List<OgrenciDersModel> getByIdService(Long id) {
        return OgrenciDersRepository.getByIdRepository(id);
    }
}
