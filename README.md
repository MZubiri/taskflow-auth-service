# TaskFlow - Auth Service 🔐

Microservicio central de autenticación, autorización y gestión de usuarios para el ecosistema **TaskFlow**. Desarrollado bajo una arquitectura limpia utilizando **Java 21** y **Spring Boot**, implementa seguridad sin estado (stateless) basada en Tokens JSON Web (JWT) con firmas criptográficas y cifrado seguro de credenciales.

---

## 🚀 Características Principales

*   **Registro de Usuarios:** Creación de nuevos perfiles de usuario en el sistema.
*   **Autenticación Segura (Login):** Validación de credenciales y generación automática de tokens de acceso **JWT**.
*   **Cifrado Criptográfico:** Contraseñas protegidas en base de datos mediante hashing unidireccional con **BCrypt** (Spring Security PasswordEncoder).
*   **Tokens JWT Personalizados:** Emisión de tokens firmados que incluyen claims personalizados de seguridad como:
    *   `idUsuario` (identificador único del usuario).
    *   `rol` (rol asignado, ej: `ROLE_USER` o `ROLE_ADMIN`).
*   **Persistencia de Datos:** Almacenamiento seguro de perfiles de usuario utilizando **Spring Data JPA** y base de datos relacional PostgreSQL.

---

## 🛠️ Stack Tecnológico

*   **Lenguaje:** Java 21 (LTS)
*   **Framework:** Spring Boot 3.4.x / 3.5.x
*   **Seguridad:** Spring Security & JWT (io.jsonwebtoken)
*   **Base de Datos:** PostgreSQL / MySQL
*   **ORM:** Spring Data JPA / Hibernate
*   **Compilador & Gestor de Dependencias:** Maven
*   **Productividad:** Project Lombok

---

## ⚙️ Configuración y Variables de Entorno

El servicio requiere las siguientes configuraciones en el archivo `application.properties` (o pasadas como variables de entorno en sistemas como Coolify/Docker):

```properties
# Puerto de escucha del servicio
server.port=8081

# Conexión a la Base de Datos
spring.datasource.url=jdbc:postgresql://localhost:5432/taskflow_auth
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update

# Clave secreta para la generación y firma de tokens JWT (Debe coincidir con la del Task Service)
jwt.secret=tu_clave_secreta_super_segura_de_al_menos_256_bits
```

---

## 📦 Instrucciones de Ejecución

### Prerrequisitos
*   Java 21 JDK instalado.
*   Base de datos PostgreSQL/MySQL corriendo y con el esquema creado.

### Compilar y Ejecutar
1.  Clona este repositorio o entra al directorio del proyecto:
    ```bash
    cd auth-service
    ```
2.  Construye el proyecto utilizando Maven:
    ```bash
    ./mvnw clean install
    ```
3.  Inicia el microservicio:
    ```bash
    ./mvnw spring-boot:run
    ```

El servicio estará disponible por defecto en el puerto **`8081`**.
