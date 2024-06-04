package com.bilgeadam.repositorys;

import com.bilgeadam.constants.OperationsSQLConstants;
import com.bilgeadam.constants.SqlDataConnectionConstans;
import com.bilgeadam.models.DersModel;
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
public class DersRepository {



    public static List<DersModel> getAllRepository() {
        List<DersModel> dersModelList = new ArrayList<>();
        try {
             ResultSet  result = SqlDataConnectionConstans.getSqlDataConnectionStatement(OperationsSQLConstants.getGetAllDersSql());
            while (result.next()) {
                dersModelList.add(new DersModel(result.getInt(1), result.getString(2),result.getInt(3)));
             }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dersModelList;
    }

    public static boolean insertRepository(DersModel dersModel) {
        System.out.println("ID: " + dersModel.getId() + " Name: " + dersModel.getDers_name() + " ders added!");
        boolean isDersInserted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getInsertByIdDersSql());
            statement.setInt(1, dersModel.getId());
            statement.setString(2, dersModel.getDers_name());
            statement.setInt(3,dersModel.getOgr_id());
            isDersInserted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDersInserted;
    }

    public boolean deleteByIdRepository(int id) {
        boolean isDersDeleted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getDeleteByDersSql());
            statement.setLong(1, id);
            isDersDeleted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDersDeleted;
    }


    public static boolean updateRepository(DersModel dersModel) {
        boolean isDersUpdated = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getUpdateDers());
            statement.setInt(1, dersModel.getId());
            statement.setString(2, dersModel.getDers_name());
            statement.setInt(3,dersModel.getOgr_id());
            isDersUpdated = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDersUpdated;
    }

    public static DersModel getByIdRepository(long id) {
        DersModel dersModel = null;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(OperationsSQLConstants.getGetbyidDersSql());
            statement.setLong(1, id);
            ResultSet  result =statement.executeQuery();
            result.next();
            dersModel = new DersModel(result.getInt(1), result.getString(2),result.getInt(3));
            result.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dersModel;
    }
}
