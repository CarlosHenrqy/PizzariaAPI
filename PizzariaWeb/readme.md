#Pizzaria API - Spring Boot

- Registro e login de usuários
- Cardápio de pizzas
- Adição e remoção de itens no carrinho
- Finalização de compras



##Tecnologias utilizadas

- Java 
- Spring Boot 
- Spring Data JPA
- MySQL

##Configuração banco dados MySQL

- CREATE DATABASE pizzaria_db;

##Atualize seu propertiers

spring.datasource.url=jdbc:mysql://localhost:3306/pizzaria_db
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

##Endpoints API
###Usuario
####POST /api/usuarios – Cadastro de novo usuário
{
"nome": "João",
"email": "joao@email.com",
"senha": "1234"
}

####POST /api/login – Autenticação
{
"email": "joao@email.com",
"senha": "1234"
}

###Pizza

GET /api/pizzas – Listar todas as pizzas

GET /api/pizzas/{id} – Detalhes de uma pizza específica

###Pizza
####GET /api/pizzas – Listar todas as pizzas
####GET /api/pizzas/{id} – Detalhes de uma pizza específica

###Carrinho
####POST /api/carrinho – Adicionar item ao carrinho
{
"usuario": { "id": 1 },
"pizza": { "id": 2 },
"quantidade": 1
}

####DELETE /api/carrinho/{id} – Remover item do carrinho
####POST /api/carrinho/finalizar – Finalizar compra
POST /api/carrinho/finalizar – Finalizar compra

#http://localhost:8080



