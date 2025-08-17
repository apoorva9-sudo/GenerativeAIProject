#  SpringGenAI – AI Powered Application with Spring Boot & OpenAI

SpringGenAI is an **AI-powered application** built using **Spring Boot** and **OpenAI APIs**.  
It integrates natural language processing and generative AI features into a modern Spring-based backend, making it easy to build intelligent applications.

---

##  Features

- **AI Chat Assistant** – Conversational interface powered by OpenAI.
- **Text Generation** – Generate human-like text for queries, summaries, and creative tasks.
- **Smart Search** – AI-based semantic understanding of queries.
- **RESTful API Endpoints** – Expose AI-powered features through clean and secure APIs.
- **Spring Boot Integration** – Standard Spring Boot project structure with controllers, services, and dependency injection.
- **Configurable API Key Management** – Securely manage and inject your OpenAI API keys via `application.properties`.
- **Extensible Architecture** – Easily plug in other AI providers or extend with new features.

---

## 🛠 Tech Stack

- **Backend**: Java 17+, Spring Boot 3.x  
- **AI Integration**: OpenAI GPT API  
- **Build Tool**: Maven     
- **Deployment**: Runs on any JVM-based environment (Tomcat / Docker / Cloud)  

---

##  Project Structure
## Project Structure
      SmartContactManager/
      ├── src/
      │   └── main/
      │       ├── java/
      │       │   └── com/smart/smartcontactmanager/
      │       │       ├── config/         # Configuration classes (Security, etc.)
      │       │       ├── controller/     # Controllers (Web & REST)
      │       │       ├── entity/         # JPA Entities (User, Contact, etc.)
      │       │       ├── repository/     # Spring Data JPA Repositories
      │       │       ├── service/        # Business Logic Layer
      │       │       └── SmartContactManagerApplication.java
      │       └── resources/
      │           ├── static/             # Static files (CSS, JS, Images)
      │           ├── templates/          # Thymeleaf Templates (HTML) 
      │           ├── application.properties
      │           └── application.yml (optional)
      ├── .gitignore
      ├── pom.xml
      └── README.md



## ⚙️ Setup & Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/SpringGenAI.git
   cd SpringGenAI
   In src/main/resources/application.properties:

   openai.api.key=your_api_key_here
   mvn spring-boot:run
##   API Endpoints
Method	Endpoint	Description
POST	/api/ai/chat	Send a prompt to OpenAI Chat
POST	/api/ai/generate	Generate text response
GET	/api/ai/health	Health check of AI service

Example Request:

    POST /api/ai/chat
       {
           "prompt": "Explain Spring Boot in simple words"
       }
Example Response:

       {
            "response": "Spring Boot is a Java framework that makes it easier to build applications quickly..."
       }

## Concluding

SpringGenAI showcases the seamless integration of **Spring Boot** with **OpenAI’s powerful APIs**, enabling developers to build intelligent, production-ready applications with ease.  
By combining the robustness of Spring with the creativity of Generative AI, this project serves as a strong foundation for future innovations such as **AI-powered assistants, automation tools, and smart enterprise solutions**.  
With further enhancements in scalability, fine-tuning, and multi-model integration, SpringGenAI can evolve into a full-fledged **AI-driven platform** for real-world use cases.

