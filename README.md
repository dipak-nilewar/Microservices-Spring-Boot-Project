# Microservices Spring Boot Project

A Spring Boot Microservices project demonstrating a distributed application architecture using **Spring Cloud, Eureka Service Registry, API Gateway, and RESTful Microservices**.

## 📌 Project Overview

This project demonstrates how multiple independent Spring Boot services communicate with each other through a centralized API Gateway and service discovery mechanism.

The project contains:

* **Service Registry** – Eureka Server for service discovery
* **API Gateway** – Central entry point for client requests
* **Quiz Service** – Manages quiz-related operations
* **Questions Service** – Manages question-related operations

## 🏗️ Architecture

```text
                    Client
                      |
                      v
               +--------------+
               |  API Gateway |
               +--------------+
                      |
          +-----------+-----------+
          |                       |
          v                       v
   +-------------+         +----------------+
   | Quiz Service|         |Questions Service|
   +-------------+         +----------------+
          |                       |
          +-----------+-----------+
                      |
                      v
              +---------------+
              | Eureka Server |
              |Service Registry|
              +---------------+
```

## 📂 Project Structure

```text
MicroServices-project/
│
├── AIP-GATEWAY/
│   └── API Gateway application
│
├── QuestionsService/
│   └── Questions microservice
│
├── QuizService/
│   └── Quiz microservice
│
├── ServiceRegistry/
│   └── Eureka Service Registry
│
└── README.md
```

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Cloud
* Spring Cloud Netflix Eureka
* Spring Cloud Gateway
* REST APIs
* Maven
* Microservices Architecture

## 🔹 Services

### 1. Service Registry

The Service Registry uses **Netflix Eureka** for service discovery.

Responsibilities:

* Registers microservices
* Maintains service information
* Allows services to discover each other
* Provides service health/status information

---

### 2. API Gateway

The API Gateway acts as the **single entry point** for client requests.

Responsibilities:

* Routes requests to appropriate services
* Provides centralized request handling
* Reduces direct client-to-service communication
* Uses service discovery to locate services

---

### 3. Quiz Service

The Quiz Service handles quiz-related functionality.

Responsibilities may include:

* Creating quizzes
* Retrieving quizzes
* Managing quiz information
* Communicating with the Questions Service

---

### 4. Questions Service

The Questions Service manages question-related functionality.

Responsibilities may include:

* Creating questions
* Retrieving questions
* Managing question data
* Providing questions to the Quiz Service

## 🔄 Service Communication

The project demonstrates communication between independent microservices.

Example:

```text
Client
  |
  v
API Gateway
  |
  v
Quiz Service
  |
  v
Questions Service
```

The services use **Eureka Service Discovery** instead of relying only on hard-coded service locations.

## 🧩 Microservices Concepts Demonstrated

This project demonstrates:

* Microservices Architecture
* Service Discovery
* Eureka Server
* API Gateway
* RESTful APIs
* Inter-service Communication
* Independent Service Deployment
* Service Registration
* Dynamic Service Discovery
* Distributed Application Architecture

## ⚙️ How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/dipak-nilewar/Microservices-Spring-Boot-Project.git
```

### Step 2: Start Service Registry

Open the `ServiceRegistry` project and run the Spring Boot application.

### Step 3: Start Questions Service

Open the `QuestionsService` project and run the application.

### Step 4: Start Quiz Service

Open the `QuizService` project and run the application.

### Step 5: Start API Gateway

Open the `AIP-GATEWAY` project and run the application.

### Step 6: Test the Application

Send requests through the API Gateway instead of directly accessing individual microservices.

## 📊 Request Flow

```text
Client Request
      |
      v
 API Gateway
      |
      v
 Eureka Service Registry
      |
      +-------------------+
      |                   |
      v                   v
 Quiz Service      Questions Service
```

## 🔐 Benefits of This Architecture

* Independent development of services
* Independent deployment
* Service discovery
* Centralized routing
* Better scalability
* Easier maintenance
* Loose coupling between services
* Improved organization of large applications

## 🔮 Future Enhancements

Possible future improvements:

* Spring Security
* JWT Authentication
* Centralized Configuration Server
* Distributed Logging
* Circuit Breaker using Resilience4j
* Docker containerization
* Kubernetes deployment
* Centralized monitoring
* Distributed tracing
* CI/CD pipeline

## 👨‍💻 Author

**Dipak Nilewar**

GitHub: `dipak-nilewar`

## ⭐ Repository

[Microservices-Spring-Boot-Project](https://github.com/dipak-nilewar/Microservices-Spring-Boot-Project?utm_source=chatgpt.com)
