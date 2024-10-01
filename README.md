# spring-boot-integracion-BCI
Implementación de una API RESTful para la creación de usuarios, para el desarrollo se utiliza Spring Boot, Spring Security con JPA Authentication, Spring Data JPA con H2

# descripcion del API RESTful
https://app.swaggerhub.com/apis-docs/snt.ramirez/integracion-BCI/1.0.0

Diagrama de la solución
https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/documentos/diagrama.pdf

# Screenshots configuraciones iniciales
1. Ingresamos a la consola de la base de datos H2 
![View Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/consoleH2.jpg)

2. Copiamos script de la ubicación

```json
INSERT INTO TB_ROLES VALUES (1,'ROLE_ADMIN');
INSERT INTO TB_ROLES VALUES (2,'ROLE_USER');
```
![Home Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/lugarInsert.jpg)


3. Ejecutamos el script -> run - commit
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/insertUpdate.jpg)
3.1 En caso de no hacer los paso prebios presentara el siguiente error:

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

4. Configuracion de expresión regular de los campos email - password
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/constantes.jpg)

# Screenshots validación de servicios
1. validación servicio /usuario/nuevo

Request

```json
{
    "name": "Santiago Ramirez",
    "email": "aaaaaaaa@dominio.cl",
    "password": "S123A567c",
    "phones": [{
            "number": "0983614350",
            "citycode": "02",
            "contrycode": "593"
        }
    ]
}
```
Response

```json
{
    "id": "123d8e3c-873d-453a-863c-ac59c7763ed0",
    "created": "2022-02-21T02:48:17.060Z",
    "modified": "2022-02-21T02:48:17.060Z",
    "last_login": "2022-02-21T02:48:17.060Z",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWFhYWFhYUBkb21pbmlvLmNsIiwiaWF0IjoxNjQ1NDExNjk3LCJleHAiOjE2NDU0NDc2OTd9.TwQYfE9vCOdLi65ihuQpUYGAsFwxNrB8pGhWHWfShcYnsYRQ-r-yOnxvu0H3UzE8yQjoObnWYfrgyfvfSH7vew",
    "isactive": true
}
```
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/servUno.jpg)

2. validación servicio /usuario/login

Request

```json
{
    "email":"aaaaaaaa@dominio.cl",
    "password":"S123A567c"
}
```
Response

```json
{
    "id": "123d8e3c-873d-453a-863c-ac59c7763ed0",
    "created": "2022-02-21T02:48:17.060Z",
    "modified": "2022-02-21T02:48:17.060Z",
    "last_login": "2022-02-21T02:48:17.060Z",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWFhYWFhYUBkb21pbmlvLmNsIiwiaWF0IjoxNjQ1NDExNjk3LCJleHAiOjE2NDU0NDc2OTd9.TwQYfE9vCOdLi65ihuQpUYGAsFwxNrB8pGhWHWfShcYnsYRQ-r-yOnxvu0H3UzE8yQjoObnWYfrgyfvfSH7vew",
    "isactive": true
}
```
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/servDos.jpg)


3. validación servicio /usuario/actualizar

Authorization

Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWFhYWFhYUBkb21pbmlvLmNsIiwiaWF0IjoxNjQ1NDExNjk3LCJleHAiOjE2NDU0NDc2OTd9.TwQYfE9vCOdLi65ihuQpUYGAsFwxNrB8pGhWHWfShcYnsYRQ-r-yOnxvu0H3UzE8yQjoObnWYfrgyfvfSH7vew

Request

```json
{
    "name": "Patricio Ramirez",
    "email": "aaaaaaaa@dominio.cl",
    "password": "S8234567abc",
    "phones": [{
            "number": "098365450",
            "citycode": "02",
            "contrycode": "593"
        }
    ]
}
```
Response

```json
{
    "id": "123d8e3c-873d-453a-863c-ac59c7763ed0",
    "created": "2022-02-21T02:48:17.060Z",
    "modified": "2022-02-21T02:56:22.550Z",
    "last_login": "2022-02-21T02:55:00.040Z",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWFhYWFhYUBkb21pbmlvLmNsIiwiaWF0IjoxNjQ1NDEyMTgyLCJleHAiOjE2NDU0NDgxODJ9.6RP5oYKR-3izZbu2Wmft8zeL--USFbSkjKLxg-f6QP5P0dUgmIKslwhITVNLyFLcSq-5sKgIgG9ZHnPP1Fd2hQ",
    "isactive": true
}
```
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/servTres.jpg)

4. validación servicio /usuario/lista

Authorization
Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWFhYWFhYUBkb21pbmlvLmNsIiwiaWF0IjoxNjQ1NDExNjk3LCJleHAiOjE2NDU0NDc2OTd9.TwQYfE9vCOdLi65ihuQpUYGAsFwxNrB8pGhWHWfShcYnsYRQ-r-yOnxvu0H3UzE8yQjoObnWYfrgyfvfSH7vew

Request

Response

```json
[
    {
        "email": "aaaaaaaa@dominio.cl",
        "created": "2022-02-21T02:48:17.060Z",
        "modified": "2022-02-21T02:56:22.550Z",
        "last_login": "2022-02-21T02:55:00.040Z",
        "isactive": true
    },
    {
        "email": "carmen.electra@gmail.com",
        "created": "2022-02-21T02:54:37.946Z",
        "modified": "2022-02-21T02:54:37.946Z",
        "last_login": "2022-02-21T02:54:37.946Z",
        "isactive": true
    }
]
```
![Create Post Page](https://github.com/sntramirez/spring-boot-integracion-BCI/blob/main/src/main/resources/static/images/servCuatro.jpg)
