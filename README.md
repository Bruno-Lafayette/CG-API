# API de Controle de Gastos

Esta API é responsável por gerenciar a comunicação entre o frontend e o banco de dados MongoDB, permitindo o registro e a consulta de gastos de maneira eficiente. Desenvolvida em Java com Spring Boot, a API fornece endpoints para manipulação de dados financeiros.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java com configuração simplificada.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar os dados de gastos.
- **MongoDB Atlas**: Serviço de banco de dados como serviço (DBaaS) para hospedagem do MongoDB na nuvem.

## Funcionalidades

- CRUD (Criar, Ler, Atualizar, Deletar) para registros de gastos.
- Categorização de despesas.
- Consultas para relatórios financeiros.
- Autenticação e segurança para acesso aos dados.

## Como Executar o Projeto

### Pré-requisitos

- Java 11 ou superior
- Maven

### Clonando o Repositório

```bash
git clone https://github.com/Bruno-Lafayette/CG-API.git
cd seu-repositorio-api
```

### Configurando o Banco de Dados

Crie uma conta no MongoDB Atlas.
Crie um novo cluster e obtenha a string de conexão.
Crie um arquivo application.properties no diretório src/main/resources e adicione as seguintes configurações:

```bash
spring.data.mongodb.uri=mongodb+srv://<usuario>:<senha>@cluster.mongodb.net/nome-do-banco?retryWrites=true&w=majority
```

Instalando Dependências

```bash
mvn install
```

Executando a Aplicação

```bash
mvn spring-boot:run
```

A API estará disponível em http://localhost:8080.

### Endpoints

Aqui estão alguns dos principais endpoints disponíveis na API:

POST /gastos - Cria um novo registro de gasto.
GET /gastos - Retorna todos os registros de gastos.
GET /gastos/{id} - Retorna um registro de gasto específico pelo ID.
PUT /gastos/{id} - Atualiza um registro de gasto existente.
DELETE /gastos/{id} - Deleta um registro de gasto pelo ID.

### Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

### Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.

### Contato

Se você tiver perguntas ou sugestões, sinta-se à vontade para entrar em contato:

Bruno Lafayette - brunolafayette@rocketmail.com

LinkedIn - https://www.linkedin.com/in/bruno-lafayette/
