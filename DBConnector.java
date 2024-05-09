package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

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

    public static boolean insertCustomer(int ID,String name, String phone, String email, String address, 
                                        String gender, int day, int month,int year){
        try(Connection conn = DBConnector.getConnection()){
            String query = "INSERT INTO CustomerDetails (ID, Name, PhoneNumber, Email, Address) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, ID);
            statement.setString(2, name);
            statement.setString(3, phone);
            statement.setString(4, email);
            statement.setString(5, address);
            
            int rowInserted = statement.executeUpdate();
            if(rowInserted > 0){
                String updateQuery = "UPDATE CustomerDetails SET Gender=?,DOB=? WHERE ID = ?;";
                PreparedStatement updatestatement = conn.prepareStatement(updateQuery);
    
                String dob = year+"-"+month+"-"+day;
                updatestatement.setString(1, gender);
                updatestatement.setString(2, dob);
                updatestatement.setInt(3, ID);
                
                int rowInserted_Update = updatestatement.executeUpdate();
                return rowInserted_Update > 0;
            } else return false;
        } catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public static int getCustomerID(String username){
        try(Connection conn = getConnection()){
            String query = "SELECT id FROM users WHERE username = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);

            ResultSet result = statement.executeQuery();

            int UserID;
            if(result.next())
            {
                UserID = result.getInt("id");
                return UserID;
            } 
            else return 0; 
        } catch(SQLException ex){
            ex.printStackTrace();
            return 0;
        }
    }
}

//INSERT INTO CustomerDetails (ID, Name, PhoneNumber, Gender, Email, Address, DOB) VALUES (?, ?, ?, ?, ?, ?, ?-?-?);
