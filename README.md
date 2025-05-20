# Spring Security with JWT  
A practical implementation of About Springboot security and Email Verification with token generation.

---

## 🚀 Prerequisites

- **Java:** 21  
- **IDE:** VS Code / IntelliJ / Spring STS 
- **Database:** PostgreSQL  

---

## ⚙️ Configuration & Execution

### 🔧 Technologies Used

- **Java 21**
- **Spring Boot 3.4.5**
- **Postgres**

---

### 📥 Setup Instructions

1. **Clone the Repository**  
   Open your terminal and run:
   ```bash
   git clone https://github.com/NithinU2802/Spring-Security.git
   cd spring_security
   ```
2. Update Maven Dependencies
   Perform a Maven update to download all project dependencies. You can do this from your IDE or by running:
   ```
    mvn clean install
   ```
3. Set Up the Database
   Open PgAdmin or your preferred Postgres client and execute the SQL queries in [data.sql](https://github.com/NithinU2802/Spring-Security/blob/main/src/main/resources/data.sql).
4. Open Google Account with an host email and generate App Password (Note: App Password page is enable if two-step verification is Turned ON ).
5. Configure Environment Variables
   Create a .env file in the root directory of the project (/spring_security) and add the following content, updating the values to match your setup:
   ```
   SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/db_name
   SPRING_DATASOURCE_USERNAME={your_username}
   SPRING_DATASOURCE_PASSWORD={your_password}
   JWT_SECRET_KEY={your_256_bit_secret_key}
   #Mail Properties
   # Support email and app password can be fount/set in our email service settings
   SUPPORT_EMAIL=your_hostmailid
    APP_PASSWORD={app_password}
   ```
6. Run the Application
   Start the application from the main method in JwtDemoApplication.java (located in the root package). You can run it directly from your IDE or using the command:
  ```
   mvn spring-boot:run
  ```

---

### ✅ Features

1. User authentication with JWT
2. Email Configuration for verification
3. Secure endpoints with role-based access control
4. Environment-based configuration
5. PostgreSQL database integration

---

### 📂 Project Structure

```
├── src/
│ ├── main/
│ │ ├── java/com/learn/jwt_demo/
│ │ │ ├── config/
│ │ │ │ ├── ApplicationConfiguration.java
│ │ │ │ ├── EmailConfiguration.java
│ │ │ │ ├── JwtAuthenticationFilter.java
│ │ │ │ └── SecurityConfiguration.java
│ │ │ ├── controller/
│ │ │ │ ├── AuthenticationController.java
│ │ │ │ └── UserController.java
│ │ │ ├── dto/
│ │ │ │ ├── LoginUserDTO.java
│ │ │ │ ├── RegisterUserDTO.java
│ │ │ │ └── VerifyUserDTO.java
│ │ │ ├── model/
│ │ │ │ └── User.java
│ │ │ ├── repository/
│ │ │ │ └── UserRepository.java
│ │ │ ├── responses/
│ │ │ │ └── LoginResponse.java
│ │ │ ├── service/
│ │ │ │ ├── AuthenticationService.java
│ │ │ │ ├── EmailService.java
│ │ │ │ ├── JwtService.java
│ │ │ │ └── UserService.java
│ │ │ └── JwtDemoApplication.java
│ ├── resources/
│ │ ├── application.properties
│ │ └── data.sql
├── test/java/com/learn/jwt_demo/
│ └── JwtDemoApplicationTests.java
├── target/classes/
├── README.md
└── pom.xml
```

---

### 📬 Contact

For any queries or suggestions, feel free to reach out via [GitHub Issues](https://github.com/NithinU2802/Spring-Security/issues).
