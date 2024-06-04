package com.bilgeadam.converters;


import com.bilgeadam.grpc.OgrenciDers;
import com.bilgeadam.models.OgrenciDersModel;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ConverterOgrenciDers {

    public static List<OgrenciDersModel> convertProtoOgrenciToModelOgrenciModelListJoin(List<OgrenciDers> ogrenciDersList) {
        List<OgrenciDersModel> protoOgrenciDersList = new ArrayList<>();
        for (OgrenciDers protoDersOgrenci : ogrenciDersList) {
            OgrenciDersModel dersOgrenciModel = new OgrenciDersModel();
            dersOgrenciModel.setId((int) protoDersOgrenci.getId());
            dersOgrenciModel.setName(protoDersOgrenci.getName());
            dersOgrenciModel.setOgr_number((int) protoDersOgrenci.getOgrNumber());
            dersOgrenciModel.setYear((int) protoDersOgrenci.getYear());
            dersOgrenciModel.setDersName(protoDersOgrenci.getDersName());
            dersOgrenciModel.setOgr_id((int) protoDersOgrenci.getOgrId());
           protoOgrenciDersList.add(dersOgrenciModel);
        }
        return protoOgrenciDersList;
    }
    public static @NotNull List<OgrenciDers> convertModelOgrenciListToProtoOgrenciModelListJoin(List<OgrenciDersModel> ogrenciDersModelList) {
        List<OgrenciDers> protoOgrenciDersList = new ArrayList<>();
        for (OgrenciDersModel ogrenciDersModel : ogrenciDersModelList)
        {
            protoOgrenciDersList.add(OgrenciDers.newBuilder()
                    .setId(ogrenciDersModel.getId())
                    .setName(ogrenciDersModel.getName())
                    .setOgrNumber(ogrenciDersModel.getOgr_number())
                    .setYear(ogrenciDersModel.getYear())
                    .setDersName(ogrenciDersModel.getDersName())
                    .setOgrId(ogrenciDersModel.getOgr_id())
                    .build());
        }
        return protoOgrenciDersList;
    }

}
