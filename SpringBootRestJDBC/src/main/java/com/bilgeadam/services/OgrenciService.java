package com.bilgeadam.services;

import com.bilgeadam.converters.ConverterOgrenci;
import com.bilgeadam.grpc.*;
import com.bilgeadam.models.OgrenciModel;
import com.bilgeadam.repositorys.OgrenciRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciService {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

    @GrpcClient("ogrenci-service")
    OperationServiceGrpc.OperationServiceBlockingStub blockingStub;

    public static String message;

    public List<OgrenciModel> getAllService() {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        OgrenciListRequest request = OgrenciListRequest.newBuilder().build();
        OgrenciListResponse response = blockingStub.listOgrenci(request);
        return ConverterOgrenci.convertProtoOgrenciToModelOgrenciModelList(response.getOgrenciList());
    }

    public boolean deleteService(int id) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        OgrenciDeleteRequest request = OgrenciDeleteRequest.newBuilder().setId(id).build();
        OgrenciDeleteResponse response = blockingStub.deleteOgrenci(request);
        return response.getIsDelete();
    }

    public boolean insertService(OgrenciModel ogrenciModel) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        Ogrenci protoOgrenci = ConverterOgrenci.convertModelOgrenciToProtoOgrenci(ogrenciModel);
        OgrenciInsertRequest request = OgrenciInsertRequest.newBuilder().setOgrenci(protoOgrenci).build();
        OgrenciInsertResponse response = blockingStub.setOgrenci(request);
        return response.getIsSaved();
    }

    public OgrenciModel getByIdService(int id) {
        return OgrenciRepository.getByIdRepository(id);
    }


    public boolean addDersService(OgrenciModel ogrenciModel, int id) {
        boolean isUpdated = false;
        try {
            blockingStub = OperationServiceGrpc.newBlockingStub(channel);
            Ogrenci protoOgrenci = ConverterOgrenci.convertModelOgrenciToProtoOgrenci(ogrenciModel);
            OgrenciUpdateRequest request = OgrenciUpdateRequest.newBuilder().setOgrenci(protoOgrenci).build();
            OgrenciUpdateResponse response = blockingStub.updateOgrenci(request);
            message = "Update Response Message --> " + response.getIsUpdated();
            System.out.println(message);
            isUpdated = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    public boolean updateService(OgrenciModel ogrenciModel, int id) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        Ogrenci protoOgrenci = ConverterOgrenci.convertModelOgrenciModelToProtoOgrenci(ogrenciModel);
        OgrenciUpdateRequest request = OgrenciUpdateRequest.
                newBuilder().setOgrenci(protoOgrenci).setId(id).build();
        OgrenciUpdateResponse response = blockingStub.updateOgrenci(request);
        boolean isSaved = response.getIsUpdated();
        return isSaved;
    }

    public boolean updateOgrenciDersService(int id) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        OgrenciDersUpdateRequest request = OgrenciDersUpdateRequest.
                newBuilder().setId(id).build();
        OgrenciDersUpdateResponse response = blockingStub.emptyOgrenciDers(request);
        boolean isSaved = response.getIsDelete();
        return isSaved;
    }

    public boolean updateOgrenciDersByAddService(OgrenciModel ogrenciModel, int id) {
        blockingStub = OperationServiceGrpc.newBlockingStub(channel);
        Ogrenci protoOgrenci = ConverterOgrenci.convertModelOgrenciModelToProtoOgrenciUpdate(ogrenciModel);
        OgrenciDersUpdateAddRequest request = OgrenciDersUpdateAddRequest.
                newBuilder().setOgrenci(protoOgrenci).setId(id).build();
        OgrenciDersUpdateAddResponse response = blockingStub.updateOgrenciDers(request);
        boolean isSaved = response.getIsDelete();
        return isSaved;
    }

}
