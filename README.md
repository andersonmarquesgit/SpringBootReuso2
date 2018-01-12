<h1>SpringBootReuso2</h1>

Obs.: Alguns dados são inseridos no H2 ao levantar a aplicação, afim de facilitar os testes.
Script de insert disponível em scripts/create_data.sql

Acesso H2:	/console<br>
JDBC URL:	jdbc:h2:~/db-h2/springboot2-h2<br>
User:	sa<br>
Password:	

<h2>ENDPOINTS - https://springbootreuso2.herokuapp.com/</h2> 		
<h2>/users</h2>
GET	- Serviço responsável por listar todos os Usuários.<br>
PUT	- Serviço responsável por listar Usuários utilizando search query (?q=query).<br>
POST - Serviço responsável por adicionar um novo Usuário.<br>
<h2>/users/{id}</h2>
GET	- Serviço responsável por retornar um Usuário com base no ID.<br>
PUT	- Serviço responsável por atualizar um Usuário específico a partir do ID informado.<br>
DELETE - Serviço responsável por remover um Usuário específico a partir do ID informado.<br>
<h2>/profiles</h2>
GET	- Serviço responsável por listar todos os Perfis.<br>
POST - Serviço responsável por adicionar um novo Perfil.<br>
<h2>/profiles/{id}</h2>
GET -	Serviço responsável por retornar um Perfil com base no ID.<br>
PUT -	Serviço responsável por atualizar um Perfil específico a partir do ID informado.<br>
DELETE - Serviço responsável por remover um Perfil específico a partir do ID informado.<br>
<h2>/users/{id}/profiles</h2>
GET - Serviço responsável por retornar todos os Perfis de um Usuário específico com base no seu ID.<br>
POST - Serviço responsável por adicionar um novo Perfil ao Usuário específico com base no seu ID.
