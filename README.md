# Employee Management System

## Overview

Developed an exam portal with distinct admin and user roles using Spring Boot and Angular. Admins manage categories, quizzes, and questions, while users attempt timed quizzes and view results.

## Features

- **Responsive User Interface:** Built with Angular to ensure seamless interaction and compatibility across various devices.
- **Admin Role:** Allows for creating, reading, updating, and deleting categories, quizzes, and questions, with categories organizing quizzes and quizzes containing relevant questions.
- **User Role:** Users can browse and attempt quizzes categorized by topics, with each quiz having a specific time limit. Quizzes are automatically submitted when time expires.
- **User-Friendly Prompts:** Integrated SweetAlert and SnackBar for confirmation prompts on successful login, registration, and CRUD operations.
- **Database Management:** MySQL is employed for efficient data storage and retrieval, with an optimized schema design.

## Technologies Used

- **Frontend:** Angular
- **Backend:** Spring Boot
- **Database:** MySQL
- **API Testing:** Postman

## Project Structure

- **Frontend:** Located in the `frontend` directory, built with Angular.
- **Backend:** Located in the `backend` directory, built with Spring Boot.
- **Database:** SQL scripts and configuration files for MySQL.

## Installation and Setup

### Prerequisites

- Node.js
- Angular CLI
- Spring Boot /Java (JDK)
- MySQL

### Frontend

1. Navigate to the `frontend` directory:
   ```bash
   cd frontend
2. Install the dependencies:
   ```bash
   npm install
3. Start the Angular development server:
   ```bash
   ng serve
4. The frontend application will be available at http://localhost:4200.
### Backend
1. Navigate to the backend directory:
   ```bash
   cd backend
2. Install the dependencies and build the project:
   ```bash
   ./mvnw install
3. Start the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
4. The backend application will be available at http://localhost:8080.

### Database
1. Install MySQL and create a database:
   ```bash
   CREATE DATABASE exam

2. Update the database configuration in the application.properties file located in the backend/src/main/resources directory:
   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/exam
    spring.datasource.username=yourUsername
    spring.datasource.password=yourPassword

## Usage
1. Access the Angular frontend at http://localhost:4200.
2. The frontend interacts with the backend APIs hosted at http://localhost:8080.
3. Perform different operations on Exam Edge UI..

## Note: All the Images/Assets are attached in the UI repo

## ScreenShots
![image](https://github.com/user-attachments/assets/b53abc73-1021-4742-a99f-fba12bb1fdcb)
![image](https://github.com/user-attachments/assets/05d2416c-d61d-4672-9943-17b854efd2a8)
![image](https://github.com/user-attachments/assets/e7778ec7-110a-4795-9d6d-f7e9bf6ac7e5)
![image](https://github.com/user-attachments/assets/441decb2-d5a0-4625-8a3c-b0be49523f76)
![image](https://github.com/user-attachments/assets/474256cd-ecb2-4248-b377-b7aafd96b6af)
![image](https://github.com/user-attachments/assets/fc6c95ec-b6cf-4893-b252-14f218880f50)
![image](https://github.com/user-attachments/assets/8751639f-658d-4c4e-9560-6d25499132af)
![image](https://github.com/user-attachments/assets/c978c087-92ac-4ac5-adbf-a69f93445999)
![image](https://github.com/user-attachments/assets/b777cbad-ae9b-4a35-8492-a713a59835f2)
![image](https://github.com/user-attachments/assets/08945356-776a-43ee-ba4b-a04f917429ef)
![image](https://github.com/user-attachments/assets/c23601f8-2bc3-49dc-a4ca-d25b00c1e988)
![image](https://github.com/user-attachments/assets/01f6c683-181a-4d9c-aa00-a384d2a1ced5)
![image](https://github.com/user-attachments/assets/37b775d8-5bb0-4a7a-ab36-f52b1dc20ba3)
![image](https://github.com/user-attachments/assets/8243dd81-5971-4264-94d5-7c2838e20425)
![image](https://github.com/user-attachments/assets/5c901e6d-be46-493c-8576-0adc640d8c88)
![image](https://github.com/user-attachments/assets/7b544a5d-38ef-4256-b09e-cd1319aca29f)
![image](https://github.com/user-attachments/assets/4480a019-f28f-4c2b-a6e1-c797500f0b89)
![image](https://github.com/user-attachments/assets/b90f4d31-ca19-41db-ac1e-903b8a3772f5)
![image](https://github.com/user-attachments/assets/4fba77e5-434b-4c16-9481-f557aa4c8054)
![image](https://github.com/user-attachments/assets/b4175d9b-9905-4e5a-846d-d1867b4bec57)
![image](https://github.com/user-attachments/assets/b47c6dd9-6ffa-4987-a018-51a0233b5f78)
![image](https://github.com/user-attachments/assets/f3bfd5a0-1d07-4dbd-8dc9-484cdac599eb)
![image](https://github.com/user-attachments/assets/7bfabd67-5d1a-4598-8037-374d0a122118)
![image](https://github.com/user-attachments/assets/7e5dd326-edcd-42d5-a07c-8521b1fa8824)
