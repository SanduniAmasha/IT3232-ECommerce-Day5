# IT3232-ECommerce-Day5
# Spring Boot Student Management API

This repository contains a Spring Boot application for managing students and courses. It provides RESTful API endpoints for CRUD operations on student and course entities.

## Project Structure

The project is organized into the following packages:

- `lk.ac.vau.fas.ict.model`: Contains entity classes like Student and Course
- `lk.ac.vau.fas.ict.controller`: Contains REST controllers for handling HTTP requests

## Main Components

### Models

1. **Student**: Represents a student with properties like registration number, name, age, course, and GPA
2. **Course**: Represents a course with properties like code, name, and credits

### Controllers

1. **AppController**: Manages student-related operations
   - Provides endpoints for retrieving, adding, updating, and deleting student records
   - Uses a HashMap for efficient student lookup by registration number

2. **ClassController**: Manages course-related operations
   - Extends the generic CRUDController for basic CRUD operations
   - Pre-populated with sample course data

3. **CRUDController**: A generic controller providing basic CRUD operations
   - Implemented as a generic class that can work with different entity types
   - Provides methods for retrieving, adding, updating, and deleting records
