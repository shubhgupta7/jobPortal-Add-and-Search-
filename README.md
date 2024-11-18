# jobPortal-Add-and-Search-
Here is a basic structure for your `README.md` file for the job portal project:

# Job Portal

## Description
This project is a job portal application that allows users to add and search for job postings. It is built using Java, Spring Boot, and MongoDB.

## Features
- Add new job postings
- Retrieve all job postings
- Get the total number of job postings

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
   git clone https://github.com/shubhgupta7/jobPortal-Add-and-Search-.git
   ```
2. Navigate to the project directory:
   ```sh
   cd jobPortal-Add-and-Search-
   ```
3. Install the dependencies:
   ```sh
   mvn install
   ```

### Running the Application
1. Start MongoDB:
   ```sh
   mongod
   ```
2. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

### API Endpoints
- **GET /posts**: Retrieve all job postings
- **GET /totalPost**: Get the total number of job postings
- **POST /post**: Add a new job posting

### Example JSON for Adding a Job Post
```json
{
  "profile": "Software Engineer",
  "desc": "Responsible for developing and maintaining software applications.",
  "exp": "3 years",
  "techs": ["Java", "Spring Boot", "MongoDB"]
}
```

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.