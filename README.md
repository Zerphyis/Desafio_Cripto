<h2> Crypiton </h2>

Crypiton é uma aplicação desenvolvida com Spring Boot para gerenciar dados sensíveis de cartões de crédito, utilizando criptografia para proteger informações confidenciais, como documentos de usuário e tokens de cartões. O sistema permite adicionar, atualizar, deletar e listar cartões, mantendo as informações seguras e protegidas.

<h4>Tecnologias Utilizadas</h4>
<br>
Java 17: A linguagem principal utilizada no desenvolvimento da aplicação.
<br>
Spring Boot: Framework para construção de aplicações Java com foco em produtividade e facilidade de uso.
<br>
JPA (Java Persistence API): Para persistência de dados no banco de dados relacional.
<br>
Spring Data JPA: Simplifica a interação com o banco de dados utilizando repositórios.
<br>
Jasypt: Biblioteca para criptografia e descriptografia de dados sensíveis.
<br>
MySQL: Banco de dados relacional utilizado para persistência.

<h4>Funcionalidades</h4>
<br>
Adicionar Cartão: Permite a inserção de um novo cartão de crédito com seus dados criptografados.
<br>
Atualizar Cartão: Permite atualizar os dados de um cartão existente, incluindo o documento do usuário, o token do cartão e o valor associado.
<br>
Deletar Cartão: Remove um cartão do sistema.
<br>
Listar Cartões: Exibe todos os cartões cadastrados no sistema.

<h4>Endpoints</h4>

<h2>Cartão</h2>

<strong>GET /cartao/adiciona: Cria um cartão no banco.
![Att cartao2](https://github.com/user-attachments/assets/bc1bc7c3-2ea8-469f-afe0-9f188c21bfca)
<br>
<br>
<strong>POST /cartao/atuliza/{id}: Atualiza  um cartão existente.
![Att cartao](https://github.com/user-attachments/assets/ab7158be-bdad-4699-9293-8afb37724da8)
<br>
<br>
<strong>PUT /usuarios/deletar/{id}: Deletar um cartão existente.
![Dell cartao](https://github.com/user-attachments/assets/1dbbcc3d-130e-4ce7-b4a6-19087f0ab8cc)
<br>
<br>
<strong>DELETE /usuarios/deletar/{id}: Buscar todos os cartões existentes.
![Listar cartao](https://github.com/user-attachments/assets/909e5561-5b02-435a-93fc-40a3c7d3efec)
<br>
<h4>Exceções</h4>
O sistema lança exceções personalizadas quando ocorrem erros, como ValidarExepction, para garantir que as falhas sejam informadas adequadamente ao usuário.


<h4>Link do repositorio do desafio:</h4>
https://github.com/backend-br/desafios/blob/master/cryptography/PROBLEM.md

