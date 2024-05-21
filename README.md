# Motor Insurance Management System

## Project Overview
The Motor Insurance Management System is a desktop application designed to automate the process of managing motor insurance policies, claims, and customer information. The system aims to enhance efficiency, reduce manual errors, and provide a user-friendly interface for both administrators and customers.

## Features
- User authentication and authorization
- Customer management
- Vehicle details management
- Policy management
- Claims processing
- Payment processing
- Reporting and analytics

## Technologies Used
- **Java**: Core programming language
- **Swing and AWT**: For creating the graphical user interface
- **Bcrypt**: For secure password hashing and authentication
- **MariaDB**: For database management

## Installation
### Prerequisites
- Java Development Kit (JDK) 8 or higher
- MariaDB
- Maven (for dependency management)

### Steps
1. **Clone the repository**
    ```bash
    git clone https://github.com/your_username/motor-insurance-management-system.git
    cd motor-insurance-management-system
    ```

2. **Set up the database**
    - Create a new database named `MIMS` in MariaDB.
    - Run the SQL script provided in the `database` directory to create tables and insert initial data.

3. **Build the project**
    ```bash
    mvn clean install
    ```

4. **Run the application**
    ```bash
    java -jar target/motor-insurance-management-system.jar
    ```

## Usage
1. **Login**: Use the admin credentials to log in.
2. **Manage Customers**: Add, update, or delete customer information.
3. **Manage Vehicles**: Add, update, or delete vehicle details.
4. **Manage Policies**: Add, update, or delete insurance policies.
5. **Process Claims**: Handle insurance claims.
6. **Process Payments**: Manage payments for policies.
7. **Generate Reports**: View and generate various reports.

## Database Schema
### Tables
- `users`: Stores user credentials.
- `AdminDetails`: Stores admin credentials.
- `CustomerDetails`: Stores customer information.
- `Vehicle_Details`: Stores vehicle information.
- `Payment`: Stores payment information.
- `List_of_Policies`: Stores policy information.



## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributers

Project Link: [https://github.com/your_username/motor-insurance-management-system](https://github.com/your_username/motor-insurance-management-system)
