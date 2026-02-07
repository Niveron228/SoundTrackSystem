# 🎵 Soundtrack Library API

A RESTful API service designed to manage a collection of movie soundtracks.
This project allows users to add new tracks, update existing ones, and search for music by composer (author) or year of publication.

## 🛠 Tech Stack
* **Java 23**
* **Spring Boot 3.x**
* **Spring Data JPA** (Database interaction)
* **H2 Database** (File-based persistence)
* **Swagger UI / OpenAPI** (API Documentation & Testing)

## 🚀 Getting Started
1.  Clone this repository.
2.  Open the project in **IntelliJ IDEA**.
3.  Run the `DemoApplication.java` file.
4.  The server will start at: `http://localhost:8080`.

## 📚 API Documentation (Swagger UI)
Once the application is running, open your browser and visit the following link to test the endpoints:
👉 **http://localhost:8080/swagger-ui/index.html**

## 🔌 Endpoints

| Method | URL | Description |
| :--- | :--- | :--- |
| **GET** | `/api/library` | Get a list of all soundtracks |
| **POST** | `/api/library` | Add a new soundtrack |
| **PUT** | `/api/library/{id}` | Update an existing track by ID |
| **GET** | `/api/library/search/{author}` | Search tracks by a specific composer |
| **GET** | `/api/library/year/{year}` | Search tracks by release year |

## 💾 Database Configuration
The application uses an H2 database stored locally in the user's home directory (`~/library_db`).
Data **persists** (is saved) even after the application is restarted.