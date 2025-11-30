# PhoneBook API -- Gerenciamento de Contatos

A **PhoneBook API** é uma aplicação REST desenvolvida em **Java com
Spring Boot** para gerenciamento de contatos.\
Ela permite **criar, listar, atualizar e excluir** contatos, garantindo
que **nomes e telefones não sejam duplicados** no banco de dados.

------------------------------------------------------------------------

## 📌 Objetivo do Projeto

Este projeto foi criado para fins de **aprendizado**, ideal para
estudantes e desenvolvedores iniciantes que desejam entender:

-   Estrutura básica de uma API REST\
-   CRUD com Spring Boot\
-   Integração com banco de dados H2\
-   Tratamento de exceções personalizadas\
-   Boas práticas de organização de código

------------------------------------------------------------------------

## 🚀 Tecnologias Utilizadas

-   Java 17+
-   Spring Boot
-   Spring Web
-   Spring Data JPA
-   H2 Database
-   Maven

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

    src/main/java/com/brando_miranda/PhoneBook
     ├── controller
     ├── service
     ├── repository
     ├── entity
    

------------------------------------------------------------------------

## 📘 Documentação da API

### 🔹 Criar contato

**POST /contacts**

Body exemplo:

``` json
{
  "name": "Maria Silva",
  "phone": "11999998888"
}
```

Possíveis retornos: - **201** -- Contato criado com sucesso\
- **400** -- Nome ou telefone já existem\
- **500** -- Erro interno

------------------------------------------------------------------------

### 🔹 Listar todos os contatos

**GET /contacts**

Retorna: - **200** -- Lista de contatos\
- **204** -- Nenhum contato encontrado

------------------------------------------------------------------------

### 🔹 Buscar contato por ID

**GET /contacts/{id}**

Retornos: - **200** -- Contato encontrado\
- **404** -- Contato não existe

------------------------------------------------------------------------

### 🔹 Atualizar contato

**PUT /contacts/{id}**

Retornos: - **200** -- Atualizado com sucesso\
- **400** -- Dados duplicados\
- **404** -- Contato não existe

------------------------------------------------------------------------

### 🔹 Deletar contato

**DELETE /contacts/{id}**

Retornos: - **204** -- Excluído\
- **404** -- Contato não existe

------------------------------------------------------------------------

## 🧪 Banco de Dados H2

Acesse o console do H2:

    http://localhost:8080/h2-console

Use as credenciais configuradas no `application.properties`.

------------------------------------------------------------------------

## 🛠 Como Rodar o Projeto

1.  Clone o repositório:

```{=html}
<!-- -->
```
    git clone https://github.com/mirandahildebrando/PhoneBook

2.  Entre na pasta:

```{=html}
<!-- -->
```
    cd phonebook-api

3.  Execute o projeto:

```{=html}
<!-- -->
```
    mvn spring-boot:run

4.  Teste no Postman ou Insomnia.

------------------------------------------------------------------------

## 📄 Licença

Este projeto é livre para estudo e modificação.

------------------------------------------------------------------------

## 🙋 Autor

**Hildebrando Miranda**\
Projeto criado para fins educacionais e portfólio.
