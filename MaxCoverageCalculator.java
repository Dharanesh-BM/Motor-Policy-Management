package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.PreparableStatement;

public class MaxCoverageCalculator {

    // Function to calculate maximum coverage
    public static double calculateMaxCoverage(int yearOfVehicle, double maxCoverageConstant, String vehicleType) {
        // Calculate the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Calculate the age of the vehicle
        int ageOfVehicle = currentYear - yearOfVehicle;

        // Initialize maximum coverage
        double maxCoverage = maxCoverageConstant;

        // Adjust maximum coverage based on the age of the vehicle and vehicle type
        if (vehicleType.equalsIgnoreCase("bike")) {
            maxCoverage -= (ageOfVehicle * 100); // Decrease by 100 for each year of age for a bike
        } else if (vehicleType.equalsIgnoreCase("car")) {
            maxCoverage -= (ageOfVehicle * 200); // Decrease by 200 for each year of age for a car
        } else {
            // Handle unsupported vehicle types
            System.out.println("Unsupported vehicle type.");
            return -1; // Return -1 to indicate an error
        }

        // Ensure maximum coverage is non-negative
        if (maxCoverage < 0) {
            maxCoverage = 0; // Set maximum coverage to 0 if it becomes negative
        }

        return maxCoverage;
    }
    public static double getMaxCoverage_usingPolicyID(int PolicyID,String VehicleNumber){
        try(Connection conn = DBConnector.getConnection()){
            String query = "SELECT * FROM Vehicle_Details WHERE registration_number = '" + VehicleNumber +"'";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            PreparedStatement st = conn.prepareStatement("SELECT * from List_of_Policies WHERE PolicyID = ?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            st.setInt(1, PolicyID);
            ResultSet result = st.executeQuery();

            if(rs.next() && result.next()){
                return MaxCoverageCalculator.calculateMaxCoverage(rs.getInt("year"),result.getDouble("Max_Coverage_Constant"),rs.getString("vehicle_category"));
            } else {
                return -1;
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }
    public static void main(String[] args) {
        int yearOfVehicle = 2018; // Example year of vehicle obtained from the database
        double maxCoverageConstant = 5000; // Example maximum coverage constant obtained from the database
        String vehicleType = "car"; // Example vehicle type obtained from the database

        // Calculate maximum coverage
        double maxCoverage = calculateMaxCoverage(yearOfVehicle, maxCoverageConstant, vehicleType);
        if (maxCoverage >= 0) {
            System.out.println("Maximum Coverage: $" + maxCoverage);
        }
    }
}