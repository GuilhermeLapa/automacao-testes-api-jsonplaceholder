# language: pt
#encoding iso-8859-1

@Testar
Funcionalidade: POST - Criar postagem

Cenário: Validar Criar Nova Postagem Sucesso
	Dado que possuo valor <userId> para campo "userId"
	E que possuo valor <id> para campo "id"
	E que possuo valor <title> para campo "title"
	E que possuo valor <body> para campo "body"
	Quando crio uma nova postagem
	Então  verifico status code 201
	E verifico no body "$" que há o campo "id"
	E verifico que o valor do campo "id" é 101
	E verifico no body "$" que há o campo "title"
	E verifico que o valor do campo "title" é "<title>"
	E verifico no body "$" que há o campo "body"
	E verifico que o valor do campo "body" é "<body>"
	E verifico no body "$" que há o campo "userId"
	E verifico que o valor do campo "userId" é 1
	Exemplos:
	| userId | id  | title | body                                                    |
	| 1      | 101 | teste | Lorem ipsum dolor sit amet, consectetur adipiscing elit |
