# Gerenciador de Tarefas com Java e MySQL

Este é um simples **Gerenciador de Tarefas** desenvolvido com **Java** e **MySQL**. O sistema permite criar, listar e gerenciar tarefas, armazenando as informações em um banco de dados MySQL. O projeto tem como objetivo ajudar a entender a integração entre Java e banco de dados, além de aplicar conceitos de CRUD (Create, Read, Update, Delete).

## Funcionalidades

- **Adicionar Tarefa**: Permite adicionar uma nova tarefa com título, descrição e status.
- **Listar Tarefas**: Exibe todas as tarefas cadastradas no sistema.
- **Atualizar Tarefa**: Permite modificar as informações de uma tarefa existente.
- **Excluir Tarefa**: Remove uma tarefa do banco de dados.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada no desenvolvimento do projeto.
- **MySQL**: Banco de dados para armazenamento das informações.
- **JDBC**: API Java para conexão com o MySQL.


## Instalação

### 1. Clonar o repositório

Clone o repositório para sua máquina local utilizando o comando:

```bash
git clone https://github.com/Reediajf/TaskMananger.git
```
### 2. Configurar o Banco de Dados
Crie um banco de dados MySQL chamado gerenciador_tarefas e execute o seguinte script SQL para criar as tabelas necessárias:

```bash

CREATE DATABASE gerenciador_tarefas;

USE gerenciador_tarefas;

CREATE TABLE tarefas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NULL,
    status VARCHAR(55) NOT NULL
);
```
### 3. Configurar as Credenciais do Banco de Dados
No arquivo de configuração do Banco de dados (ConexaoDB), defina as credenciais para conectar ao seu banco de dados MySQL:

``` bash
private static String mysql_host = ""; //Host do banco de dados.
    private  static String mysql_username = ""; //Usuario do banco de dados.
    private static String mysql_password = ""; //Senha do banco de dados.
```
## 4. Compilar e Executar o Projeto
