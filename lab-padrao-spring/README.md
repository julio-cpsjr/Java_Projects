# 📌 <Nome do Projeto>

API REST desenvolvida em **Java** utilizando o **Spring Boot**, com operações de **CRUD**, documentação automática via **Swagger/OpenAPI** e persistência de dados em banco **H2** em memória.

O projeto tem como objetivo demonstrar boas práticas no desenvolvimento de APIs REST, incluindo organização em camadas, uso de banco de dados relacional e documentação acessível.

---

## 🚀 Tecnologias Utilizadas

- **Java** (JDK 11+)
- **Spring Boot**
    - Spring Web
    - Spring Data JPA
- **Hibernate**
- **H2 Database**
- **Swagger / OpenAPI**
- **Maven**

---

## 🏗️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

- **Controller**: Responsável por expor os endpoints REST
- **Service**: Contém a regra de negócio
- **Repository**: Acesso aos dados via JPA
- **Model / Entity**: Representação das entidades do banco de dados

---

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java JDK 11 ou superior**
- **Maven 3.8+**
- **IDE** (IntelliJ, Eclipse, VS Code, etc.)

---

## ⚙️ Configuração do Projeto

O banco de dados **H2** é configurado para rodar em memória, não sendo necessária nenhuma instalação adicional.

Exemplo de configuração (`application.properties`):

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
