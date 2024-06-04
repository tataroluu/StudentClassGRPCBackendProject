package com.bilgeadam.converters;


import com.bilgeadam.grpc.Ogrenci;
import com.bilgeadam.models.OgrenciModel;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ConverterOgrenci {

    public static Ogrenci convertModelOgrenciToProtoOgrenci(OgrenciModel ogrenciModel) {
        return Ogrenci.newBuilder().setId((int) ogrenciModel.getId()).setName(ogrenciModel.getName()).setOgrNumber((int) ogrenciModel.getOgr_number()).setYear((int) ogrenciModel.getYear()).build();
    }

    public static Ogrenci convertModelOgrenciDersToProtoOgrenciDers(OgrenciModel ogrenciModel) {
        return Ogrenci.newBuilder()
                .setId((int) ogrenciModel.getId())
                .setName(ogrenciModel.getName())
                .setOgrNumber((int) ogrenciModel.getOgr_number())
                .setYear((int) ogrenciModel.getYear())
                .build();
    }

    public static @NotNull List<Ogrenci> convertModelOgrenciListToProtoOgrenciModelList(List<OgrenciModel> ogrenciModelList) {
        List<Ogrenci> protoOgrenciList = new ArrayList<>();
        for (OgrenciModel ogrenciModel : ogrenciModelList)
        {
            protoOgrenciList.add(Ogrenci.newBuilder()
                    .setId(ogrenciModel.getId())
                    .setName(ogrenciModel.getName())
                    .setOgrNumber(ogrenciModel.getOgr_number())
                    .setYear(ogrenciModel.getYear())
                            .setDers1(ogrenciModel.getDers1())
                            .setDers2(ogrenciModel.getDers2())
                            .setDers3(ogrenciModel.getDers3())
                    .build());
        }
        return protoOgrenciList;
    }

    public static List<OgrenciModel> convertProtoOgrenciToModelOgrenciModelList(List<Ogrenci> ogrenciList) {
        List<OgrenciModel> protoOgrenciList = new ArrayList<>();
        for (Ogrenci protoOgrenci : ogrenciList) {
            OgrenciModel ogrenciModel = new OgrenciModel();
            ogrenciModel.setId((int) protoOgrenci.getId());
            ogrenciModel.setName(protoOgrenci.getName());
            ogrenciModel.setOgr_number((int) protoOgrenci.getOgrNumber());
            ogrenciModel.setYear((int) protoOgrenci.getYear());
            ogrenciModel.setDers1(protoOgrenci.getDers1());
            ogrenciModel.setDers2(protoOgrenci.getDers2());
            ogrenciModel.setDers3(protoOgrenci.getDers3());
             protoOgrenciList.add(ogrenciModel);
        }
        return protoOgrenciList;
    }

    public static Ogrenci convertModelOgrenciModelToProtoOgrenci(OgrenciModel ogrenciModel) {
        return Ogrenci.newBuilder()
                .setId(ogrenciModel.getId())
                .setName(ogrenciModel.getName())
                .setOgrNumber(ogrenciModel.getOgr_number())
                .setYear(ogrenciModel.getYear())
                .build();
    }



    public static Ogrenci convertModelOgrenciModelToProtoOgrenciUpdate(OgrenciModel ogrenciModel) {
        return Ogrenci.newBuilder()
                 .setDers1(ogrenciModel.getDers1())
                .setDers2(ogrenciModel.getDers2())
                .setDers3(ogrenciModel.getDers3())
                .build();
    }

    public static OgrenciModel convertProtoOgrenciToModelOgrenciModelUpdate(Ogrenci protoOgrenci) {
        OgrenciModel ogrenciModel = new OgrenciModel();
        ogrenciModel.setDers1(protoOgrenci.getDers1());
        ogrenciModel.setDers2(protoOgrenci.getDers2());
        ogrenciModel.setDers3(protoOgrenci.getDers3());
        return ogrenciModel;
    }

    public static OgrenciModel convertProtoOgrenciToModelOgrenciModel(Ogrenci protoOgrenci) {
        OgrenciModel ogrenciModel = new OgrenciModel();
        ogrenciModel.setId((int) protoOgrenci.getId());
        ogrenciModel.setName(protoOgrenci.getName());
        ogrenciModel.setOgr_number((int) protoOgrenci.getOgrNumber());
        ogrenciModel.setYear((int) protoOgrenci.getYear());
        return ogrenciModel;
    }
}
