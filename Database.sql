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
CREATE TABLE RC_Details (
    registration_number VARCHAR(255) PRIMARY KEY NOT NULL,
    make TEXT NOT NULL,
    model TEXT NOT NULL,
    year INTEGER NOT NULL,
    owner_name VARCHAR(255),
    color VARCHAR(50),
    vehicle_category VARCHAR(10) NOT NULL CHECK (vehicle_category IN ('Car', 'Bike','Bus'))
);

-- Insert data with vehicle_category specified
INSERT INTO RC_Details (registration_number, make, model, year, owner_name, color, vehicle_category)
VALUES 
('PY01T2910', 'HeroHonda', 'Splendor', 2002, 'Raj Kishore', 'Black', 'Bike'),
('TN31E5955', 'Hundai', 'Santro', 2004, 'Sankar', 'Silver', 'Car'),
('TN37Y7879', 'Honda', 'Civic', 2019, 'Mike Mama', 'Red', 'Car'),
('TN39AX1530', 'HeroHonda', 'Splendor', 2002 ,'Deepak', 'Silver', 'Bike'),
('TN42AY7474', 'HeroHonda', 'PassionPro', 2008 ,'Dharanesh', 'Blue', 'Bike'),
('TN36CX9636', 'Bajaj', 'Pulsar', 2010 ,'Jeevan', 'Red', 'Bike'),
('TN12EA4567', 'Hero', 'Xtreme', 2013 ,'Nitheesh', 'Red', 'Bike'),
('TN37RE7594', 'Yamaha', 'FZ-S', 2019 ,'SaiAdithya', 'Blue', 'Bike'),
('TN45DF3625', 'Audi', 'A8', 2023 ,'Raj Kishore', 'Blue', 'Car'),
('TN41ER4568', 'BMW', 'M4', 2010 ,'Vivek', 'Blue', 'Car'),
('KL02TX1439', 'Harley-Davidson', 'Street 750', 2021, 'Elon Musk', 'Black', 'Bike');

-- Create Vehicle Details 
CREATE TABLE Vehicle_Details (
    ID int,
    registration_number VARCHAR(255) PRIMARY KEY NOT NULL,
    make TEXT NOT NULL,
    model TEXT NOT NULL,
    year INTEGER NOT NULL,
    owner_name VARCHAR(255),
    color VARCHAR(50),
    vehicle_category VARCHAR(10) NOT NULL CHECK (vehicle_category IN ('Car', 'Bike','Bus'))
); 

