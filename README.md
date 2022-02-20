# spring-boot-integracion-BCI
Implementación de una API RESTful para la creación de usuarios, para el desarrollo se utiliza Spring Boot, Spring Security con JPA Authentication, Spring Data JPA con H2

# descripcion del API RESTful
https://app.swaggerhub.com/apis-docs/snt.ramirez/integracion-BCI/1.0.0

# Screenshots configuraciones iniciales
1. Ingresamos a la consola de la base de datos H2
![View Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/consoleH2.jpg)

2. Copiamos script de la ubicación
![Home Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/lugarInsert.jpg)


3. Ejecutamos el script run - commit
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/insertUpdate.jpg)
3.1 en caso de hacer los paso anteriores presentara el error:
```json
{
    "error": [
        {
            "code": "internal",
            "message": "Error en servidor",
            "campo": ""
        }
    ]
}
```

