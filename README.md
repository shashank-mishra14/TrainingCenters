# Training Center Registry (Traini8)

A Spring Boot application for managing government-funded training centers with REST APIs.

## Features

- Create new training centers with validation
- Get all training centers
- H2 in-memory database integration
- Input validation for:
  - Center code (12-character alphanumeric)
  - Phone number validation
  - Email validation
  - Mandatory field checks
- Automatic timestamp generation
- Error handling with meaningful messages

## Technologies

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Prerequisites

- JDK 17
- Maven (Optional - Wrapper included)
- Postman/cURL (for API testing)

## Quick Start

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/training-center-registry.git
cd training-center-registry
# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
