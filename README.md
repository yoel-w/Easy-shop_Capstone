# EasyShop E-Commerce Application

A full-stack e-commerce web application built with a Spring Boot REST API backend and a vanilla JavaScript frontend.

## Overview

EasyShop is an online shopping platform that allows users to browse products by category, filter by price and sub-category, manage a shopping cart, and place orders. Administrators can manage products and categories.

## Tech Stack

**Backend**
- Java 17
- Spring Boot 4.0
- Spring Security + JWT authentication
- Spring Data JPA
- MySQL
- Maven

**Frontend**
- HTML / CSS / Vanilla JavaScript
- Communicates with the backend via REST API

## Features

- User registration and login with JWT-based authentication
- Browse and search products with filters (category, price range, sub-category)
- View product details
- Shopping cart management (add, update, remove items)
- Checkout and order creation
- User profile management
- Admin-only endpoints for managing products and categories

## Project Structure

```
Capstone 3/
├── vsv23/                        # Spring Boot backend
│   ├── src/
│   │   └── main/java/org/yearup/
│   │       ├── controllers/      # REST controllers
│   │       ├── models/           # Domain models
│   │       ├── repository/       # Data access interfaces
│   │       ├── service/          # Business logic
│   │       └── security/         # JWT & Spring Security config
│   ├── database/                 # SQL scripts to create the database
│   └── pom.xml
└── capstone-client-easyshop/     # Frontend client
    ├── index.html
    ├── css/
    ├── js/
    └── templates/
```

## Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL

### Database Setup

1. Open MySQL and run the setup script:
   ```bash
   mysql -u root -p < vsv23/database/create_database_easyshop.sql
   ```

### Backend Setup

1. Navigate to the backend directory:
   ```bash
   cd (folder name)
   ```

2. Configure your database credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/easyshop
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   The API will start on `http://localhost:8080`.

### Frontend Setup

Open `capstone-client-easyshop/index.html` in your browser. Make sure the API base URL in `js/config.js` points to your running backend.

## Running Tests

```bash
cd (folder name)
./mvnw test
```
