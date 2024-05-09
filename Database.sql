--users - Table to store username and password

    -- Create a new database
    CREATE DATABASE MIMS;

    -- Use the newly created database
    USE MIMS;

    -- Create a table to store user credentials
    CREATE TABLE users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) UNIQUE NOT NULL,
        password VARCHAR(100) NOT NULL
    );
;
--Customer table 
    -- create table to store customer details
    CREATE TABLE CustomerDetails (
        ID INT PRIMARY KEY,
        Name VARCHAR(50),
        PhoneNumber VARCHAR(20),
        Gender VARCHAR(10),
        Email VARCHAR(50),
        Address VARCHAR(255),
        DOB DATE
    );
