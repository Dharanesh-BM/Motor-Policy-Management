package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class PolicyPremiumCalculator {

    // Function to calculate policy premium
    public static double calculatePolicyPremium(int yearOfVehicle, double maxCoverageConstant, String vehicleType) {
        // Calculate the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Calculate the age of the vehicle
        int ageOfVehicle = currentYear - yearOfVehicle;

        // Calculate maximum coverage
        double maxCoverage = MaxCoverageCalculator.calculateMaxCoverage(yearOfVehicle, maxCoverageConstant, vehicleType);

        if (maxCoverage < 0) {
            // If max coverage calculation returns an error
            return -1; // Return -1 to indicate an error
        }

        // Initialize base premium rate
        double basePremiumRate;

        // Set base premium rate based on vehicle type
        if (vehicleType.equalsIgnoreCase("bike")) {
            basePremiumRate = 0.05; // 5% of the max coverage for bikes
        } else if (vehicleType.equalsIgnoreCase("car")) {
            basePremiumRate = 0.1; // 10% of the max coverage for cars
        } else {
            // Handle unsupported vehicle types
            System.out.println("Unsupported vehicle type.");
            return -1; // Return -1 to indicate an error
        }

        // Calculate premium adjustment based on age of the vehicle
        double ageFactor;
        if (ageOfVehicle <= 5) {
            ageFactor = 1.0; // No increase for vehicles 5 years old or newer
        } else if (ageOfVehicle <= 10) {
            ageFactor = 1.2; // 20% increase for vehicles between 6 and 10 years old
        } else {
            ageFactor = 1.5; // 50% increase for vehicles older than 10 years
        }

        // Calculate the final premium
        double premium = maxCoverage * basePremiumRate * ageFactor;

        return premium;
    }
    public static double getPremiuim_UsingPolicyID(int PolicyID,String VehicleNumber){
        try(Connection conn = DBConnector.getConnection()){

            String query = "SELECT * FROM Vehicle_Details WHERE registration_number = '" + VehicleNumber +"'";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            PreparedStatement st = conn.prepareStatement("SELECT * from List_of_Policies WHERE PolicyID = ?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            st.setInt(1, PolicyID);
            ResultSet result = st.executeQuery();

            if(rs.next() && result.next()){
                return calculatePolicyPremium(rs.getInt("year"),result.getInt("Max_Coverage_Constant"),rs.getString("vehicle_category"));
            } else {
                return -1;
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }
    // Example usage
    public static void main(String[] args) {
        int yearOfVehicle = 2018; // Example year of vehicle obtained from the database
        double maxCoverageConstant = 5000; // Example maximum coverage constant obtained from the database
        String vehicleType = "car"; // Example vehicle type obtained from the database

        // Calculate policy premium
        double premium = calculatePolicyPremium(yearOfVehicle, maxCoverageConstant, vehicleType);
        if (premium >= 0) {
            System.out.println("Policy Premium: $" + premium);
        }
    }
}

