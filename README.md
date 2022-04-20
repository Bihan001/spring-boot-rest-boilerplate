# SPRING BOOT REST API BOILERPLATE

## Authors

- [@Bihan001](https://www.github.com/Bihan001)

## Run Locally

Clone the project

```bash
  git clone https://github.com/Bihan001/spring-boot-rest-boilerplate.git
```

Go to the project directory

```bash
  cd spring-boot-rest-boilerplate
```

Install dependencies

```bash
  mvn clean install
```

Set configurationfor the project

```bash
  cd src/main/resources
  cp ./templates/application-template.yml ./application-dev.yml
  # Now replace variables with your values
```

Start the server

- mvn spring-boot:run

## Tech Stack

Java 11, Spring Boot 2.6.6, Apache Maven 3.6.3

## API Reference

#### Get Student with Id

```http
  GET /api/v1/student/${studentId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `studentId` | `Number` | **Required**. Student Id |

#### Get Course with Id

```http
  GET /api/v1/course/${courseId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `courseId`      | `Number` | **Required**. Course Id |

#### Create New Student

```http
  POST /api/v1/student/new
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `String` | **Required**. Name of Student |
| `email`      | `String` | **Required**. Email of Student |
| `birthDate`      | `String` | **Required**. Birth Date of Student (YYYY-MM-DD) |
| `phone`      | `String` | Phone Number of Student  |
| `address`      | `String` | Address of Student  |
| `city`      | `String` | Current City of Student  |
| `state`      | `String` | Current State of Student  |
| `zip`      | `String` | Current Zip Code of Student  |
| `country`      | `String` | Current Country of Student  |

#### Create New Course

```http
  POST /api/v1/course/new
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `String` | **Required**. Course Name |
| `description` | `String` | Course Description  |
| `duration` | `Number` | Duration of the course in miliseconds  |

#### Enroll Student in Course

```http
  POST /api/v1/course/enroll
```

| Parameter  | Type     | Description                       |
| :--------  | :------- | :-------------------------------- |
| `studentId`| `Number` | **Required**. Id of the student |
| `courseId` | `Number` | **Required**. Id of the course  |