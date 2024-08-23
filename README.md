# Sistema de Autenticación y Gestión de Clientes con Spring Boot

Este proyecto implementa la parte del servidor para un sistema de autenticación de usuarios utilizando Spring Boot. Además de la autenticación, el servidor proporciona un CRUD para gestionar clientes, accesible solo para los usuarios autenticados.

## Características

- **Spring Boot:** Utilizado para la configuración del servidor y la gestión de dependencias.
- **Registro de Usuarios:** Permite la creación de nuevas cuentas con un nombre de usuario y una contraseña.
- **Inicio de Sesión:** Autenticación de usuarios mediante nombre de usuario y contraseña. Generación de JWT al autenticarse exitosamente.
- **Protección de Rutas:** Rutas específicas protegidas que requieren un JWT válido para su acceso.
- **Validación de Token:** Validación del JWT en cada solicitud a rutas protegidas para asegurar que el usuario esté autenticado.
- **CRUD de Clientes:** Permite a los usuarios autenticados realizar operaciones de creación, lectura, actualización y eliminación (CRUD) sobre un conjunto de clientes.

## Tecnologías Utilizadas

- **Java 21**
- **Spring Boot 3.3.3**
- **Spring Security:** Para la gestión de la autenticación y autorización.
- **JWT:** Para la creación y validación de tokens de autenticación.
- **JPA/Hibernate:** Para la interacción con la base de datos.
- **PostgreSQL:** Base de datos utilizada para almacenar la información de usuarios y clientes.
- **Maven:** Para la gestión de dependencias.
