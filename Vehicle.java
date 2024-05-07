package com.example;

public class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    private String RC;
    private String ownerName;
    private String policyID;
    private String customerID;
    private String policyStart;
    private String policyEnd;
    private boolean insuranceStatus;

    public Vehicle(String vehicleNumber, String vehicleType, String RC, String ownerName, String policyID, String customerID, String policyStart, String policyEnd, boolean insuranceStatus) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.RC = RC;
        this.ownerName = ownerName;
        this.policyID = policyID;
        this.customerID = customerID;
        this.policyStart = policyStart;
        this.policyEnd = policyEnd;
        this.insuranceStatus = insuranceStatus;
    }
    
}
