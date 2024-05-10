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
-- Create List of policies table
CREATE TABLE List_of_Policies (
    PolicyID INT PRIMARY KEY,
    PolicyName VARCHAR(255) NOT NULL,
    Provider VARCHAR(100),
    VehicleType ENUM('Car', 'Bike', 'Bus') NOT NULL,
    ClaimsSettled INT,
    PolicyDuration INT,
    Highlights TEXT,
    Exclusions TEXT,
    ClaimProcedure TEXT
);
--Insert values into list of policies
INSERT INTO List_of_Policies (PolicyID, PolicyName, Provider, VehicleType, ClaimsSettled, PolicyDuration, Highlights, Exclusions, ClaimProcedure)
VALUES
(1,'Reliance Bike Policy','Reliance','Bike',98,12,'->Coverage for damages caused by natural disasters such as floods, earthquakes, and hurricanes.
->Protection against theft, vandalism, and other non-collision-related incidents.
->Reimbursement for towing and transportation costs in case of an accident.
->Coverage for damage to accessories and modifications installed in the vehicle.
->Optional add-ons for coverage during international travel or rental car expenses.
->Access to premium repair facilities with manufacturer-certified technicians.
->Guaranteed replacement cost coverage for brand-new vehicles within the first year.
->Personalized claim assistance with dedicated customer support representatives.','->Excludes coverage for incidents that occur while driving under the influence of alcohol or drugs.
->Damage caused by intentional or reckless acts, including racing or participating in illegal activities.
->Excludes coverage for regular maintenance and wear and tear of the vehicle.
->Losses resulting from driving outside of designated geographic areas or driving outside of approved hours.
->Excludes coverage for vehicles used for commercial purposes or ridesharing services.
->Damage caused by natural disasters such as floods, earthquakes, and hurricanes may be excluded from standard policies.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.
->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(2,'SBI bike policy','SBI','Bike',36,12,'->Legal coverage for bodily injury or death caused to third parties in an accident.
->Protection against property damage liabilities resulting from a covered accident.
->Coverage extends to legal expenses and court fees incurred during claims processing.
->Financial security against lawsuits and settlements arising from third-party claims.
->Assistance in negotiating settlements and handling legal disputes on behalf of the insured.
->Flexibility to choose coverage limits based on individual risk profiles and requirements.
->Access to expert legal advisors specializing in motor insurance litigation.
->Coverage verification services to ensure compliance with legal requirements and regulations.','->Excludes coverage for vehicles used for daily commuting or regular transportation purposes.
->Damage resulting from improper storage, inadequate maintenance, or neglect of the vehicle.
->Excludes coverage for vehicles used for competitive racing, speed testing, or stunts.
->Losses resulting from the vehicle''s depreciation or market value fluctuations over time.
->Damage caused by rodents, insects, or other pests may not be covered under standard policies.
->Excludes coverage for vehicles that are not properly registered or do not meet safety requirements.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(3,'Bajaj Bike policy','Bajaj','Bike',97,12,'->Personalized premiums based on actual driving behavior and usage patterns.
->Real-time monitoring of driving habits such as speed, acceleration, and braking.
->Potential for significant savings for safe drivers with low-risk driving profiles.
->Incentives and rewards for maintaining safe driving practices over time.
->Access to driving data analytics and insights for improving driving skills.
->Flexible policy terms with the ability to adjust coverage and premiums as needed.
->Integration with mobile apps and telematics devices for seamless data collection.
->Privacy protection measures to safeguard personal information and driving data.','->Excludes coverage for incidents that occur while the telematics device is disabled or malfunctioning.
->Damage resulting from unauthorized use of the vehicle or driving by unauthorized drivers.
->Excludes coverage for driving violations such as speeding, reckless driving, or traffic violations.
->Losses resulting from driving in prohibited areas or engaging in prohibited activities.
->Excludes coverage for vehicles used for commercial purposes or transportation of hazardous materials.
->Damage caused by mechanical failures or pre-existing conditions of the vehicle may not be covered.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.-> Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(4,'National bike policy','National','Bike',50,12,'->Agreed value coverage to ensure full compensation for the vehicle''s appraised value.
->Specialized coverage for antique, vintage, and classic cars with unique restoration needs.
->Flexible usage restrictions tailored to occasional or hobbyist driving habits.
->Coverage for restoration costs, spare parts, and original equipment replacements.
->Access to expert appraisers and valuation specialists for accurate vehicle assessments.
->Options for temporary coverage during transportation, exhibitions, or storage.
->Membership benefits and discounts for enthusiast clubs and vintage car events.
->Dedicated claims handling by specialists with expertise in classic car restoration and preservation.','->Excludes coverage for incidents that occur while the vehicle is being used for commercial purposes.
->Damage resulting from off-road driving or driving in hazardous conditions such as floods or wildfires.
->Excludes coverage for incidents that occur while the vehicle is being used by an unauthorized driver.
->Losses resulting from mechanical failures, engine breakdowns, or normal wear and tear.
->Damage caused by acts of terrorism, war, civil unrest, or nuclear events may be excluded.
->Excludes coverage for incidents that occur while the vehicle is being used for racing or speed.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(5,'Shriram bike policy','Shriram','Bike',55,12,'->Protection against financial loss in case of a total loss or theft of the vehicle.
->Covers the difference between the actual cash value of the vehicle and the amount owed on the loan or lease.
->Helps bridge the "gap" between the insurance payout and the remaining loan or lease balance.
->Provides peace of mind by ensuring that you won''t be left with a financial burden after a loss.
->Flexible coverage options available for new and used vehicles.
->Options to include coverage for depreciation and negative equity.
->Easy claims process with dedicated support for gap insurance claims.
->Affordable premiums with the potential for significant savings compared to loan/lease provider offerings.','->Excludes coverage for vehicles that are not properly registered or do not meet safety standards.
->Damage resulting from intentional acts, fraud, or criminal activities is not covered.
->Excludes coverage for vehicles that have been modified or altered without approval from the insurer.
->Losses resulting from pre-existing damage, rust, corrosion, or gradual deterioration.
->Damage caused by natural disasters such as earthquakes, floods, or hurricanes may be excluded.
->Excludes coverage for incidents that occur while the vehicle is being used for commercial purposes.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(6,'Reliance car Policy','Reliance','Car',98,12,'->Coverage for damages caused by natural disasters such as floods, earthquakes, and hurricanes.
->Protection against theft, vandalism, and other non-collision-related incidents.
->Reimbursement for towing and transportation costs in case of an accident.
->Coverage for damage to accessories and modifications installed in the vehicle.
->Optional add-ons for coverage during international travel or rental car expenses.
->Access to premium repair facilities with manufacturer-certified technicians.
->Guaranteed replacement cost coverage for brand-new vehicles within the first year.
->Personalized claim assistance with dedicated customer support representatives.','->Excludes coverage for incidents that occur while driving under the influence of alcohol or drugs.
->Damage caused by intentional or reckless acts, including racing or participating in illegal activities.
->Excludes coverage for regular maintenance and wear and tear of the vehicle.
->Losses resulting from driving outside of designated geographic areas or driving outside of approved hours.
->Excludes coverage for vehicles used for commercial purposes or ridesharing services.
->Damage caused by natural disasters such as floods, earthquakes, and hurricanes may be excluded from standard policies.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(7,'SBI car policy','SBI','Car',36,12,'->Legal coverage for bodily injury or death caused to third parties in an accident.
->Protection against property damage liabilities resulting from a covered accident.
->Coverage extends to legal expenses and court fees incurred during claims processing.
->Financial security against lawsuits and settlements arising from third-party claims.
->Assistance in negotiating settlements and handling legal disputes on behalf of the insured.
->Flexibility to choose coverage limits based on individual risk profiles and requirements.
->Access to expert legal advisors specializing in motor insurance litigation.
->Coverage verification services to ensure compliance with legal requirements and regulations.','->Excludes coverage for vehicles used for daily commuting or regular transportation purposes.
->Damage resulting from improper storage, inadequate maintenance, or neglect of the vehicle.
->Excludes coverage for vehicles used for competitive racing, speed testing, or stunts.
->Losses resulting from the vehicle''s depreciation or market value fluctuations over time.
->Damage caused by rodents, insects, or other pests may not be covered under standard policies.
->Excludes coverage for vehicles that are not properly registered or do not meet safety requirements.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(8,'Bajaj Car policy','Bajaj','Car',97,12,'->Personalized premiums based on actual driving behavior and usage patterns.
->Real-time monitoring of driving habits such as speed, acceleration, and braking.
->Potential for significant savings for safe drivers with low-risk driving profiles.
->Incentives and rewards for maintaining safe driving practices over time.
->Access to driving data analytics and insights for improving driving skills.
->Flexible policy terms with the ability to adjust coverage and premiums as needed.
->Integration with mobile apps and telematics devices for seamless data collection.
->Privacy protection measures to safeguard personal information and driving data.','->Excludes coverage for incidents that occur while the telematics device is disabled or malfunctioning.
->Damage resulting from unauthorized use of the vehicle or driving by unauthorized drivers.
->Excludes coverage for driving violations such as speeding, reckless driving, or traffic violations.
->Losses resulting from driving in prohibited areas or engaging in prohibited activities.
->Excludes coverage for vehicles used for commercial purposes or transportation of hazardous materials.
->Damage caused by mechanical failures or pre-existing conditions of the vehicle may not be covered.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(9,'National Car policy','National','Car',50,12,'->Agreed value coverage to ensure full compensation for the vehicle''s appraised value.
->Specialized coverage for antique, vintage, and classic cars with unique restoration needs.
->Flexible usage restrictions tailored to occasional or hobbyist driving habits.
->Coverage for restoration costs, spare parts, and original equipment replacements.
->Access to expert appraisers and valuation specialists for accurate vehicle assessments.
->Options for temporary coverage during transportation, exhibitions, or storage.
->Membership benefits and discounts for enthusiast clubs and vintage car events.
->Dedicated claims handling by specialists with expertise in classic car restoration and preservation.','->Excludes coverage for incidents that occur while the vehicle is being used for commercial purposes.
->Damage resulting from off-road driving or driving in hazardous conditions such as floods or wildfires.
->Excludes coverage for incidents that occur while the vehicle is being used by an unauthorized driver.
->Losses resulting from mechanical failures, engine breakdowns, or normal wear and tear.
->Damage caused by acts of terrorism, war, civil unrest, or nuclear events may be excluded.
->Excludes coverage for incidents that occur while the vehicle is being used for racing or speed.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.'),
(10,'Shriram Car policy','Shriram','Car',55,12,'->Protection against financial loss in case of a total loss or theft of the vehicle.
->Covers the difference between the actual cash value of the vehicle and the amount owed on the loan or lease.
->Helps bridge the "gap" between the insurance payout and the remaining loan or lease balance.
->Provides peace of mind by ensuring that you won''t be left with a financial burden after a loss.
->Flexible coverage options available for new and used vehicles.
->Options to include coverage for depreciation and negative equity.
->Easy claims process with dedicated support for gap insurance claims.
->Affordable premiums with the potential for significant savings compared to loan/lease provider offerings.','->Excludes coverage for vehicles that are not properly registered or do not meet safety standards.
->Damage resulting from intentional acts, fraud, or criminal activities is not covered.
->Excludes coverage for vehicles that have been modified or altered without approval from the insurer.
->Losses resulting from pre-existing damage, rust, corrosion, or gradual deterioration.
->Damage caused by natural disasters such as earthquakes, floods, or hurricanes may be excluded.
->Excludes coverage for incidents that occur while the vehicle is being used for commercial purposes.','->In the event of an incident giving rise to a claim under the policy, the following steps should be taken.->Lodge an FIR with the police immediately.->Immediate written intimation to the policy issuing office or nearest office or online portal.->Obtain a Claim Form & submit it duly completed.->Extend full cooperation to the investigator appointed by the insurance company.');
