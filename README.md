# Springboot Login - JWT

## Prerequisites
- Java 17
- Maven installed on your machine
- SQL Database

## Installation
1. Clone the repository: `git clone git@github.com:doped-semiconductor/spring-jwt-login.git`
2. Build with maven: `mvn clean install`
3. Run the application: `java -jar target/login-0.0.1-SNAPSHOT.jar`

## API 

   | Path      | Data                                                             | Purpose           |
   |-----------|------------------------------------------------------------------|-------------------|
   | /register | `{"username":"qa", "name": "Quangela Quolie", "password": "qa"}` | Register New User |
   | /login    | `{"username":"qa", "password": "qa"}`                            | Login to Existing User
   | /test     | Use Bearer token from login                                      | Check if Authentication is Working on Path |



