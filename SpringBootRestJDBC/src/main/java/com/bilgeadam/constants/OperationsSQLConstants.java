package com.bilgeadam.constants;


import lombok.Getter;

@Getter
public class OperationsSQLConstants {

    //DersOgrenci Constants
    private static final String GET_ALL_JOIN_BY_ID_OGRENCI_SQL= "SELECT o.id as \"o.id\", o.name as \"o.name\", o.ogr_number as \"o.ogr_number\", o.year as \"o.year\", d.name as \"d.name\",d.ogr_id as \"d.ogr_id\"  FROM public.ogrenci as o join public.ders as d on o.ogr_number =d.ogr_id WHERE o.id=? ORDER BY o.id ASC";
    private static final String GET_ALL_JOIN_OGRENCI_SQL= "SELECT o.id as \"o.id\", o.name as \"o.name\", o.ogr_number as \"o.ogr_number\", o.year as \"o.year\", d.name as \"d.name\",d.ogr_id as \"d.ogr_id\"  FROM public.ogrenci as o join public.ders as d on o.ogr_number =d.ogr_id ORDER BY o.id ASC";

    //Ogrenci SQL Constants
    private static final String GET_ALL_OGRENCI_SQL= "SELECT * FROM public.ogrenci  ORDER BY id ASC";
    private static final String DELETE_BY_OGRENCI_SQL= "DELETE FROM public.ogrenci where id=?";
    private static final String INSERT_BY_ID_OGRENCI_SQL= "INSERT INTO public.ogrenci( id, name, ogr_number, year,ders1,ders2,ders3) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_OGRENCI_SQL= "UPDATE public.ogrenci SET id=?, name=?, ogr_number=?, year=? WHERE id=?";
    private static final String UPDATE_OGRENCI_DERS_SQL= "UPDATE public.ogrenci SET ders1='ders girilmedi!', ders2= 'ders girilmedi!',  ders3= 'ders girilmedi!' WHERE id=?";
    private static final String UPDATE_OGRENCI_DERS_ADD_SQL= "UPDATE public.ogrenci SET ders1= ?, ders2= ?,  ders3= ? WHERE id=?";
    private static final String GETBYID_OGRENCI_SQL= "SELECT * FROM public.ogrenci where id=?";



    //Ders SQL Constans
    private static final String GET_ALL_DERS_SQL= "SELECT * FROM public.ders ORDER BY id ASC";
    private static final String DELETE_BY_DERS_SQL= "DELETE FROM public.ders WHERE id=?";
    private static final String INSERT_BY_ID_DERS_SQL= "INSERT INTO public.ders( id, name, ogr_id) VALUES (?, ?, ?)";
    private static final String UPDATE_DERS=  "UPDATE public.ders SET id=?, name=?, ogr_id=? WHERE id=?";
    private static final String GETBYID_DERS_SQL= "SELECT * FROM public.ders where id=?";

    //Get Methods for Ogrenci
    public static String getGetAllOgrenciSql(){return GET_ALL_OGRENCI_SQL;}
    public static String getGetAllJoinByIdOgrenciSql(){return GET_ALL_JOIN_BY_ID_OGRENCI_SQL;}
    public static String getGetAllJoinOgrenciSql(){return GET_ALL_JOIN_OGRENCI_SQL;}
    public static String getDeleteByOgrenciSql(){return DELETE_BY_OGRENCI_SQL;}
    public static String getInsertByIdOgrenciSql(){return INSERT_BY_ID_OGRENCI_SQL;}
    public static String getUpdateOgrenciSql(){return UPDATE_OGRENCI_SQL;}
    public static String getUpdateOgrenciDersSql(){return UPDATE_OGRENCI_DERS_SQL;}
    public static String getUpdateOgrenciDersAddSql(){return UPDATE_OGRENCI_DERS_ADD_SQL;}
     public static String getGetbyidOgrenciSql(){return GETBYID_OGRENCI_SQL;}

    //Get Methods for Ders
    public static String getGetAllDersSql(){return GET_ALL_DERS_SQL;}
    public static String getDeleteByDersSql(){return DELETE_BY_DERS_SQL;}
    public static String getInsertByIdDersSql(){return INSERT_BY_ID_DERS_SQL;} 
    public static String getUpdateDers(){return UPDATE_DERS;}
    public static String getGetbyidDersSql(){return GETBYID_DERS_SQL;}
}
