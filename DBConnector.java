package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/MIMS";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "2904";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static boolean insertUser(String username, String password) {
        try (Connection conn = getConnection()) {
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean insertVehicle(){
        try (Connection conn = getConnection()){
            String query = "INSERT INTO vehice_details()";
            PreparedStatement statement = conn.prepareStatement(query);
            int rowInserted = statement.executeUpdate();
            return rowInserted > 0;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    

    public static int getCustomerID(String username){
        try(Connection conn = getConnection()){
            String query = "SELECT CustomerID FROM users WHERE username = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);

            ResultSet result = statement.executeQuery();

            int UserID;
            if(result.next())
            {
                UserID = result.getInt("CustomerID");
                return UserID;
            } 
            else return 0; 
        } catch(SQLException ex){
            ex.printStackTrace();
            return 0;
        }
    }

    public static int getCustomerID_UsingVehicleNumber(String VehicleNumber){
        try(Connection conn = getConnection()){
            String query = "SELECT CustomerID FROM Vehicle_Details WHERE registration_number = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, VehicleNumber);

            ResultSet result = statement.executeQuery();

            int CustomerID;
            if(result.next())
            {
                CustomerID = result.getInt("CustomerID");
                return CustomerID;
            } 
            else return 0;
        } catch (SQLException ex){
            ex.printStackTrace();
            return 0;
        }
    }
}

//INSERT INTO CustomerDetails (ID, Name, PhoneNumber, Gender, Email, Address, DOB) VALUES (?, ?, ?, ?, ?, ?, ?-?-?);
