# Job Portal

This is a Spring Boot application for managing job posts. It provides endpoints to add, search, and retrieve job posts from a MongoDB database.

## Technologies Used

- Java
- Spring Boot
- MongoDB
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MongoDB

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/shubhgupta7/jobPortal.git
   cd jobPortal
   ```

2. Update the MongoDB connection string in `application.properties`:
   ```ini
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/?retryWrites=true&w=majority&appName=Cluster0
   spring.data.mongodb.database=shubhgupta
   ```

3. Build the project using Maven:
   ```sh
   mvn clean install
   ```

4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### Frontend

The frontend for this project can be accessed at [UISpringMongodb](https://github.com/navinreddy20/UISpringMongodb). Follow the instructions in the repository to start the frontend application.

### CORS Error

The CORS error has been resolved by allowing requests from `http://localhost:3000`.

## API Endpoints

### Get All Posts

- **URL:** `/posts`
- **Method:** `GET`
- **Description:** Retrieves all job posts.
- **Response:** List of job posts.

### Get Total Post Count

- **URL:** `/totalPost`
- **Method:** `GET`
- **Description:** Retrieves the total number of job posts.
- **Response:** Integer count of job posts.

### Add a Post

- **URL:** `/post`
- **Method:** `POST`
- **Description:** Adds a new job post.
- **Request Body:** JSON representation of a `post` object.
- **Response:** Confirmation message.

### Search Posts

- **URL:** `/search/{text}`
- **Method:** `GET`
- **Description:** Searches for job posts containing the specified text.
- **Path Variable:** `text` - The text to search for.
- **Response:** List of job posts matching the search criteria.

## Example `post` Object

```json
{
  "profile": "Software Engineer",
  "desc": "Responsible for developing applications.",
  "exp": "3 years",
  "techs": ["Java", "Spring Boot", "MongoDB"]
}
```

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.