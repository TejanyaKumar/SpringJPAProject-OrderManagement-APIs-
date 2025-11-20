📦 Order Management APIs – Spring Boot Project
📌 Overview

This project is a Spring Boot–based Order/Product Management System providing REST APIs to create, read, update, delete, and search products.
It demonstrates best practices using Spring Boot, Spring Data JPA, MySQL, and Hibernate.

This project is suitable for learning, interview preparation, and portfolio showcasing.

🚀 Features
✅ Product APIs

Create a new product

Save multiple products

Get all products

Get product by ID

Search product by name

Update product rating

Delete product

🗄 Technologies Used

Java

Spring Boot

Spring Web

Spring Data JPA

Hibernate

MySQL Database

Maven

📁 Project Structure
src/
 └── main/
     ├── java/
     │   └── com.flm
     │       ├── controller
     │       ├── service
     │       ├── service.impl
     │       ├── dto
     │       ├── model
     │       └── dao
     └── resources/
         ├── application.properties
         └── schema.sql / data.sql (if any)

🔧 How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/TejanyaKumar/SpringJPAProject-OrderManagement-APIs.git
cd SpringJPAProject-OrderManagement-APIs

2️⃣ Configure MySQL

Update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Application

Use Maven:

mvn spring-boot:run


Or run the main class:

OrderManagementApplication.java

📡 API Endpoints

➤ Create product
POST /api/products

➤ Get all products
GET /api/products

➤ Get product by ID
GET /api/products/{id}

➤ Search by name
GET /api/products/search/{name}

➤ Save multiple products
POST /api/products/save-all

➤ Update product rating
PUT /api/products/{id}/rating/{rating}

➤ Delete product
DELETE /api/products/{id}

📚 Sample Product JSON
{
  "productName": "Laptop",
  "price": 55000,
  "discount": 10,
  "stock": 5
}

🧑‍💻 Author

Tejanya Kumar
Java Full Stack Developer
