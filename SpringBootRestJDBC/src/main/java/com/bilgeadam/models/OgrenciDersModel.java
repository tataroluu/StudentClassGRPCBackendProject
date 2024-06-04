package com.bilgeadam.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
 @NoArgsConstructor
public class OgrenciDersModel {

    private int id;
    private String name;
    private  int ogr_number;
    private int year;
    private String dersName;
    private int ogr_id;

 }

