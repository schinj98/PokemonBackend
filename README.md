# Pokemon Assessment Backend

Spring Boot backend service for a simple Pokedex application.

## Features

* Search pokemon by name
* Clean REST APIs
* External API integration with PokeAPI
* Response caching using Caffeine
* Global exception handling
* Swagger/OpenAPI documentation
* Optimized DTO responses

---

## Tech Stack

* Java 21
* Spring Boot
* WebClient
* Caffeine Cache
* Maven

---

## Run Locally

### Clone Repository

```bash
git clone <your-github-repo>
```

### Navigate To Backend

```bash
cd backend
```

### Install Dependencies

```bash
mvn clean install
```

### Start Application

```bash
mvn spring-boot:run
```

Server will run on:

```text
http://localhost:8080
```

---

## API Endpoints

### Health Check

```http
GET /api/v1/health
```

### Search Pokemon

```http
GET /api/v1/pokemon/{name}
```

Example:

```http
GET /api/v1/pokemon/pikachu
```

---

## Swagger Documentation

```text
http://localhost:8080/swagger-ui/index.html
```

---

## Cache Configuration

* Cache Provider: Caffeine
* Cache Expiry: 10 minutes
* Max Cache Entries: 100

---

## External API

This project uses:

https://pokeapi.co/

---

## Sample Response

```json
{
  "id": 25,
  "name": "pikachu",
  "imageUrl": "...",
  "height": 4,
  "weight": 60,
  "baseExperience": 112
}
```
