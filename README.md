# Student Management System – Spring Boot CRUD Application

A full-stack Java web application built using **Spring Boot**, **Spring Security**, **Thymeleaf**, and **MySQL**. This project allows users to manage student records through a secure login system. It includes full CRUD functionality, backend form validation, and a user-friendly interface styled with custom CSS.

This application was developed as part of the **CA2 assignment** for the *Commercial Solutions Design* module at **CCT College Dublin**.

---

## 🚀 Features

- 🔒 Login authentication using Spring Security
- ➕➖✏️🗑️ Add, edit, delete, and view students (CRUD)
- ✅ Backend validation with Spring annotations
- 🎨 Custom CSS styling (no Bootstrap used)
- 🧾 Thymeleaf for server-side rendering
- ⚠️ JavaScript alerts for delete confirmation and search
- 📋 Sorted by newest student first
- 🛢️ MySQL integration using Spring Data JPA

---

## 🛠️ Technologies Used

- Java 17  
- Spring Boot 3  
- Spring Security  
- Spring Data JPA  
- Thymeleaf  
- MySQL  
- HTML / CSS / JavaScript  

---

## 📦 Getting Started

### ✅ Prerequisites

- Java 17  
- Maven  
- MySQL installed and running  

### ⚙️ Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AMMAD-2022532/Studet_Crud_web.git
   cd Studet_Crud_web
   ```

2. **Create a MySQL database**:
   ```sql
   CREATE DATABASE studentsdb;
   ```

3. **Update your DB credentials** in `src/main/resources/application.properties`:
   ```
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Open your browser** and visit:
   ```
   http://localhost:8080
   ```

6. **Login credentials**:
   ```
   Username: CCT1234
   Password: 54321
   ```

---

## 📁 Folder Structure

```
Studet_Crud_web/
│
├── controller/
├── entity/
├── repository/
├── service/
│
├── static/
│   ├── css/
│   └── js/
│
├── templates/
│   ├── login.html
│   ├── student_form.html
│   └── student_list.html
│
└── application.properties
```

---

## 📘 About the Project

This project was developed for an academic assignment. The goal was to create a real-world enterprise application using Spring technologies, focusing on security, data validation, and full CRUD interaction with a MySQL database. The frontend is clean and styled with custom CSS and interactive JS alerts.

---

## 👨‍🎓 Author

**Ammad Hussain**  
3rd year  Student – BSc in Computing  
CCT College Dublin  
Student ID: 2022532  
