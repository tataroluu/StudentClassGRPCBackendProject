package com.bilgeadam.repositorys;

import com.bilgeadam.constants.OperationsSQLConstants;
import com.bilgeadam.constants.SqlDataConnectionConstans;
import com.bilgeadam.models.OgrenciModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class OgrenciRepository {



    public static List<OgrenciModel> getAllRepository() {
        List<OgrenciModel> ogrenciModelList = new ArrayList<>();
        try {
             ResultSet  result = SqlDataConnectionConstans.getSqlDataConnectionStatement(OperationsSQLConstants.getGetAllOgrenciSql());
            while (result.next()) {
              ogrenciModelList.add(new OgrenciModel(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4),result.getString(5),result.getString(6),result.getString(7)));
             }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ogrenciModelList;
    }

     public static OgrenciModel getByIdRepository(long id) {
        OgrenciModel ogrenciModel = null;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getGetbyidOgrenciSql());
            statement.setLong(1, id);
            ResultSet  result =statement.executeQuery();
            result.next();
            ogrenciModel = new OgrenciModel(
                    result.getInt(1)
                    , result.getString(2)
                    , result.getInt(3)
                    , result.getInt(4)
                    ,result.getString(5)
                    ,result.getString(6)
                    ,result.getString(7));
            result.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ogrenciModel;
    }

    public static boolean insertRepository(OgrenciModel ogrenciModel) {
        System.out.println("ID: " + ogrenciModel.getId() + " Name: " + ogrenciModel.getName() + " ogrenci added!");
        boolean isOgrenciInserted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getInsertByIdOgrenciSql());
            statement.setInt(1, ogrenciModel.getId());
            statement.setString(2, ogrenciModel.getName());
            statement.setInt(3, ogrenciModel.getOgr_number());
            statement.setInt(4, ogrenciModel.getYear());
            statement.setString(5,"ders girilmedi!");
            statement.setString(6,"ders girilmedi!");
            statement.setString(7,"ders girilmedi!");
            isOgrenciInserted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOgrenciInserted;
    }

    public boolean deleteByIdRepository(int id) {
        boolean isOgrenciDeleted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getDeleteByOgrenciSql());
            statement.setLong(1, id);
            isOgrenciDeleted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOgrenciDeleted;
    }


    public static boolean updateRepository(OgrenciModel ogrenciModel,int id) {
        System.out.println("ID: " + ogrenciModel.getId() + " Name: " + ogrenciModel.getName() + " ogrenci updated!");
        boolean isUpdated = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getUpdateOgrenciSql());
            statement.setInt(1, ogrenciModel.getId());
            statement.setString(2, ogrenciModel.getName());
            statement.setInt(3, ogrenciModel.getOgr_number());
            statement.setInt(4, ogrenciModel.getYear());
            statement.setInt(5,id);
            isUpdated = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }


    public static boolean updateOgrenciDersRepository(int id)
    {
        System.out.println("ID: " + id +  " ogrenci ders is updated!");
        boolean isUpdated = false;
        try
        {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getUpdateOgrenciDersSql());
            statement.setInt(1, id);
            isUpdated = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return isUpdated;
    }

    public static boolean updateOgrenciDersByAddRepository(OgrenciModel ogrenciModel,int id)
    {
        System.out.println("ID: " + ogrenciModel.getId() + " Name: " + ogrenciModel.getName() + " ogrenci updated!");
        boolean isUpdated = false;
        try
        {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getUpdateOgrenciDersAddSql());
            statement.setString(1, ogrenciModel.getDers1());
            statement.setString(2,ogrenciModel.getDers2());
            statement.setString(3, ogrenciModel.getDers3());
            statement.setInt(4, id);
            isUpdated = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return isUpdated;
    }


}
