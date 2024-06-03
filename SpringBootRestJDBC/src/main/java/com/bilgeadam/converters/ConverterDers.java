package com.bilgeadam.converters;

import com.bilgeadam.grpc.Ders;
import com.bilgeadam.models.DersModel;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ConverterDers {
    public static List<DersModel> convertProtoDersToModelDersModelList(List<Ders> dersList) {
        List<DersModel> protoDersList = new ArrayList<>();
        for (Ders protoDers : dersList) {
            DersModel dersModel = new DersModel();
            dersModel.setId((int) protoDers.getId());
            dersModel.setDers_name(protoDers.getDersName());
            dersModel.setOgr_id((int) protoDers.getOgrId());
            protoDersList.add(dersModel);
        }
        return protoDersList;
    }

    public static Ders convertModelDersToProtoDers(DersModel dersModel) {
        return Ders.newBuilder()
                .setId((int) dersModel.getId())
                .setDersName(dersModel.getDers_name())
                .setOgrId(dersModel.getOgr_id())
                .build();
    }
    public static DersModel convertProtoDersToModelDersModel(Ders protoDers) {
        DersModel dersModel = new DersModel();
        dersModel.setId((int) protoDers.getId());
        dersModel.setDers_name(protoDers.getDersName());
        dersModel.setOgr_id((int) protoDers.getOgrId());

        return dersModel;
    }

    public static @NotNull List<Ders> convertModelDersListToProtoDersModelList(List<DersModel>dersModelList) {
        List<Ders> protoDersList = new ArrayList<>();
        for (DersModel dersModel :dersModelList)
        {
            protoDersList.add(Ders.newBuilder()
                    .setId(dersModel.getId())
                    .setDersName(dersModel.getDers_name())
                    .setOgrId(dersModel.getOgr_id())
                    .build());
        }
        return protoDersList;
    }
}
