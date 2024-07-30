

# BlogApplication Backend Using SpringBoot

## Description
This is a project for a blog application built using Spring Boot. The application provides a RESTful API for managing blog posts, utilizing JPA for data persistence and PostgreSQL as the database.

## Prerequisites
- **Java 17**: Ensure you have JDK 17 installed. You can download it from [AdoptOpenJDK](https://adoptopenjdk.net/) or your preferred distribution.
- **Maven**: Apache Maven 3.6.0 or later is required for building the project.
- **PostgreSQL**: PostgreSQL should be installed and running. Ensure you have a database set up for the application.

## Project Structure
The project uses the following dependencies:
- **Spring Boot Starter Data JPA**: For data access and manipulation.
- **Spring Boot Starter Web**: For building RESTful APIs.
- **PostgreSQL**: Database driver for connecting to PostgreSQL.
- **Lombok** (optional): For reducing boilerplate code.
- **Spring Boot Starter Test**: For testing purposes.

## Configuration
### Database Configuration
To connect the application to a PostgreSQL database, you need to configure the database settings. These configurations can be set in the `application.properties` or `application.yml` file located in the `src/main/resources` directory.

**Example `application.properties`**:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```

Replace `your-database`, `your-username`, and `your-password` with your PostgreSQL database name, username, and password, respectively.

### Lombok
Lombok is an optional dependency used to reduce boilerplate code. Make sure you have the Lombok plugin installed in your IDE for full support. You can download the Lombok plugin for your specific IDE from [Lombok's official website](https://projectlombok.org/).

## Building and Running the Application
### Build the Project
To build the project, navigate to the project's root directory and run:
```bash
mvn clean install
```

### Run the Application
After building the project, you can run the Spring Boot application using:
```bash
mvn spring-boot:run
```

Alternatively, you can run the generated JAR file:
```bash
java -jar target/BlogApplication-0.0.1-SNAPSHOT.jar
```

## Testing
The project includes unit tests using Spring Boot's testing framework. To run the tests, use the following command:
```bash
mvn test
```

## REST API Endpoints
The application exposes the following REST API endpoints:

- `GET /`: Welcome message.
- `GET /blogs`: Retrieve all blogs.
- `GET /blog/{id}`: Retrieve a blog by its ID.
- `POST /addBlog`: Add a new blog.
- `DELETE /deleteBlog/{id}`: Delete a blog by its ID.
- `PUT /updateBlog`: Update an existing blog.
- `GET /search/{keyword}`: Search blogs by keyword.

## Deployment
To deploy the application, package it as a JAR file using Maven and then deploy it to your preferred server environment.



## Contributors
- [Goli Vishnuvardhan Reddy](https://github.com/vishnuvardhanreddy31) - Initial work

## Acknowledgements
- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)
- [Lombok](https://projectlombok.org/)

