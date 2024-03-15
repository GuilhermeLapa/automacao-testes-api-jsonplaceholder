# language: pt
#encoding iso-8859-1

@Testar
Funcionalidade: GET - Consultar postagem por Id

Cenário: Validar Consultar Postagem por Id Sucesso
	Dado que possuo valor <id> para campo "id"
	Quando consulto uma postagem por id
	Então  verifico status code 200
	E verifico no body "$" que há o campo "id"
	E verifico que o valor do campo "id" é 1
	E verifico no body "$" que há o campo "title"
	E verifico que o valor do campo "title" é "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"
	E verifico no body "$" que há o campo "body"
	#E verifico que o valor do campo "body" é "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
	E verifico no body "$" que há o campo "userId"
	E verifico que o valor do campo "userId" é 1
	Exemplos:
	| id |
	| 1  |

Cenário: Validar Postagem Não Encontrada
	Dado que possuo valor <userId> para campo "userId"
	E que possuo valor <id> para campo "id"
	E que possuo valor <title> para campo "title"
	E que possuo valor <body> para campo "body"
	Quando crio uma nova postagem
	E verifico status code 201
	E salvo o id da postagem cadastrada para consultar
	E consulto uma postagem por id
	Então verifico status code 404
	Exemplos:
	| userId | id  | title | body                                                    |
	| 1      | 101 | teste | Lorem ipsum dolor sit amet, consectetur adipiscing elit |
