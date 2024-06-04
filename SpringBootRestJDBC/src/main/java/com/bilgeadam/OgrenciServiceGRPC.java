package com.bilgeadam;

import com.bilgeadam.converters.ConverterDers;
import com.bilgeadam.converters.ConverterOgrenci;
import com.bilgeadam.converters.ConverterOgrenciDers;
import com.bilgeadam.grpc.*;
import com.bilgeadam.models.DersModel;
import com.bilgeadam.models.OgrenciDersModel;
import com.bilgeadam.models.OgrenciModel;
import com.bilgeadam.repositorys.DersRepository;
import com.bilgeadam.repositorys.OgrenciDersRepository;
import com.bilgeadam.repositorys.OgrenciRepository;
import io.grpc.stub.StreamObserver;
import lombok.NonNull;
import net.devh.boot.grpc.server.service.GrpcService;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@GrpcService
public class OgrenciServiceGRPC extends OperationServiceGrpc.OperationServiceImplBase {

    @Override
    public void listOgrenci(@NotNull OgrenciListRequest request,  StreamObserver<OgrenciListResponse> responseObserver) {
        List<OgrenciModel> ogrenciModelList = OgrenciRepository.getAllRepository();
        List<Ogrenci> protoOgrenci = ConverterOgrenci.convertModelOgrenciListToProtoOgrenciModelList(ogrenciModelList);
        OgrenciListResponse ogrenciListResponse = OgrenciListResponse.newBuilder().addAllOgrenci(protoOgrenci).build();
        responseObserver.onNext(ogrenciListResponse);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void deleteOgrenci(@NotNull OgrenciDeleteRequest request, StreamObserver<OgrenciDeleteResponse> responseObserver) {
        boolean isdeleted = new OgrenciRepository().deleteByIdRepository(request.getId());
        OgrenciDeleteResponse response = OgrenciDeleteResponse.newBuilder().setIsDelete(isdeleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void setOgrenci(@NotNull OgrenciInsertRequest request, StreamObserver<OgrenciInsertResponse> responseObserver) {
        Ogrenci protoOgrenci = request.getOgrenci();
        OgrenciModel ogrenciModel = ConverterOgrenci.convertProtoOgrenciToModelOgrenciModel(protoOgrenci);
        boolean isSaved = OgrenciRepository.insertRepository(ogrenciModel);
        OgrenciInsertResponse Response = OgrenciInsertResponse.newBuilder().setIsSaved(isSaved).build();
        responseObserver.onNext(Response);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void listOgrenciDers(@NotNull OgrenciDersListRequest request, StreamObserver<OgrenciDersListResponse> responseObserver) {
        List<OgrenciDersModel> ogrenciDersModelList = OgrenciDersRepository.getAllRepository();
        List<OgrenciDers> protoDersOgrenci = ConverterOgrenciDers.convertModelOgrenciListToProtoOgrenciModelListJoin(ogrenciDersModelList);
       OgrenciDersListResponse ogrenciListResponse = OgrenciDersListResponse.newBuilder().addAllOgrenciDers(protoDersOgrenci).build();
        responseObserver.onNext(ogrenciListResponse);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void setDers(@NotNull DersInsertRequest request, StreamObserver<DersInsertResponse> responseObserver) {
        Ders protoDers= request.getDers();
        DersModel dersModel = ConverterDers.convertProtoDersToModelDersModel(protoDers);
        boolean isSaved = DersRepository.insertRepository(dersModel);
        DersInsertResponse Response = DersInsertResponse.newBuilder().setIsSaved(isSaved).build();
        responseObserver.onNext(Response);
        responseObserver.onCompleted();
    }

    @Override
     public void deleteDers(@NotNull DersDeleteRequest request, StreamObserver<DersDeleteResponse> responseObserver) {
        boolean isdeleted = new DersRepository().deleteByIdRepository(request.getId());
        DersDeleteResponse response = DersDeleteResponse.newBuilder().setIsDelete(isdeleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void listDers(@NotNull DersListRequest request, StreamObserver<DersListResponse> responseObserver) {
        List<DersModel> dersModelList = DersRepository.getAllRepository();
        List<Ders> protoDers = ConverterDers.convertModelDersListToProtoDersModelList(dersModelList);
        DersListResponse dersListResponse = DersListResponse.newBuilder().addAllDers(protoDers).build();
        responseObserver.onNext(dersListResponse);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void updateOgrenci(@NotNull OgrenciUpdateRequest request, StreamObserver<OgrenciUpdateResponse> responseObserver) {
         Ogrenci protoOgrenci = request.getOgrenci();
        OgrenciModel ogrenciModel = ConverterOgrenci.convertProtoOgrenciToModelOgrenciModel(protoOgrenci);
        boolean isSaved = OgrenciRepository.updateRepository(ogrenciModel,request.getId());
        OgrenciUpdateResponse response = OgrenciUpdateResponse.newBuilder().setIsUpdated(isSaved).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void emptyOgrenciDers(@NotNull OgrenciDersUpdateRequest request, StreamObserver<OgrenciDersUpdateResponse> responseObserver) {
         boolean isSaved = OgrenciRepository.updateOgrenciDersRepository(request.getId());
        OgrenciDersUpdateResponse response =  OgrenciDersUpdateResponse.newBuilder().setIsDelete(isSaved).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @NonNull
    public void updateOgrenciDers(@NotNull OgrenciDersUpdateAddRequest request, StreamObserver<OgrenciDersUpdateAddResponse> responseObserver) {
        Ogrenci protoOgrenci = request.getOgrenci();
        OgrenciModel modelOgrenci
                = ConverterOgrenci.convertProtoOgrenciToModelOgrenciModelUpdate(protoOgrenci);
        boolean isSaved = OgrenciRepository.updateOgrenciDersByAddRepository(modelOgrenci,request.getId());
        OgrenciDersUpdateAddResponse response =  OgrenciDersUpdateAddResponse.newBuilder().setIsDelete(isSaved).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}



