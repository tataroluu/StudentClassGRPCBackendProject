package com.bilgeadam.repositorys;

import com.bilgeadam.constants.OperationsSQLConstants;
import com.bilgeadam.constants.SqlDataConnectionConstans;
import com.bilgeadam.models.OgrenciDersModel;
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
public class OgrenciDersRepository {

    public static List<OgrenciDersModel> getAllRepository() {
        List<OgrenciDersModel> dersOgrenciModelList = new ArrayList<>();
        try {
            //prepared statement item eklendi sorguya
             ResultSet  result = SqlDataConnectionConstans.getSqlDataConnectionStatement(OperationsSQLConstants.getGetAllJoinOgrenciSql());
            while (result.next()) {
                 dersOgrenciModelList.add(new OgrenciDersModel(
                        result.getInt(1)
                        , result.getString(2)
                        , result.getInt(3)
                        , result.getInt(4)
                        ,result.getString(5)
                         , result.getInt(6)
                ));
             }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dersOgrenciModelList;
    }

    public static List<OgrenciDersModel> getByIdRepository(long id) {
        List<OgrenciDersModel> ogrenciDersModelList = new ArrayList<>();
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getGetAllJoinByIdOgrenciSql());
            statement.setLong(1, id);
            ResultSet  result =statement.executeQuery();
            while (result.next()) {
                ogrenciDersModelList.add(new OgrenciDersModel(
                  result.getInt(1)
                  ,result.getString(2)
                  ,result.getInt(3)
                  ,result.getInt(4)
                  ,result.getString(5)
                  ,result.getInt(6)
                ));
            }
            result.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ogrenciDersModelList;
    }
}
