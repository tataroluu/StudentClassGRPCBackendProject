package com.bilgeadam.constants;

import lombok.Getter;

import java.sql.*;

@Getter
public class SqlDataConnectionConstans {

   public static PreparedStatement prepareStatement;
   public static Connection connection;
   public static ResultSet result;

    public static ResultSet getSqlDataConnectionStatement(String ogrenciSQLConstants) {
        ResultSet result =null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = connection.createStatement();
            result = statement.executeQuery(ogrenciSQLConstants);

        }catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static ResultSet getSqlDataResultSet(String ogrenciSQLConstants) {
        ResultSet result =null;
        try {
            result = getSqlDataStatement().executeQuery(ogrenciSQLConstants);

        }catch ( SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static Connection getSqlDataConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Statement getSqlDataStatement() {
        Statement statement = null;
        try {
            statement = getSqlDataConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static PreparedStatement getSqlDataPreparedStatement(String ogrenciSQLConstants) {
        PreparedStatement statement = null;
        try {
            statement = getSqlDataConnection().prepareStatement(ogrenciSQLConstants);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

}
