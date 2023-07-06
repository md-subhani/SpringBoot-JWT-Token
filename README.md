# SpringBoot-JWT-Token
This application will use to generate JWT token by using Spring boot and H2db

This Application contains 3 controllers
1. JwtAuthenticationController -> which is used to generate JWT token by interacting with H2db database.
2. HelloWorldController -> This is sample controller to test our JWT token, without JWT token you will get 401 unauthorized error.
3. UserController -> To add a new User

In this Application we are using H2db with pre scripts like schema.sql and data.sql.

**Authenticate curl call**
curl --location 'http://localhost:8080/authenticate' \
--header 'Content-Type: application/json' \
--data '{
    "username": "***",
    "password": "***"
}'

**Hello world curl call**
curl --location 'http://localhost:8080/hello' \
--header 'Authorization: Bearer *******' \
--data ''

**Post User curl call**
curl --location 'http://localhost:8080/user' \
--header 'Content-Type: application/json' \
--data '{
    "username": "java",
    "password": "java"
}'

