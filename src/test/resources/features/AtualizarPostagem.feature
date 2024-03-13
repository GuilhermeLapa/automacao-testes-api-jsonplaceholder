# language: pt
#encoding iso-8859-1

@Testar
Funcionalidade: PUT - Atualizar postagem

Cenário: Validar Atualizar Nova Postagem Sucesso
	Dado que possuo valor <id> para campo "id"
	Quando consulto uma postagem por id
	E que possuo valor <userId> para campo "userId"
	E que possuo valor <title> para campo "title"
	E que possuo valor <body> para campo "body"
	E salvo os dados da postagem consultada
	E atualizo uma postagem
	Então  verifico status code 200
	E verifico no body "$" que há o campo "id"
	E verifico que o valor do campo "id" é <id>
	E verifico no body "$" que há o campo "title"
	E verifico que o valor do campo "title" é "<title>"
	E verifico no body "$" que há o campo "body"
	E verifico que o valor do campo "body" é "<body>"
	E verifico no body "$" que há o campo "userId"
	E verifico que o valor do campo "userId" é <userId>
	Exemplos:
	| userId | id | title          | body                                                                |
	| 1      | 1  | testeAtualizar | Atualizado: Lorem ipsum dolor sit amet, consectetur adipiscing elit |

Cenário: Validar Atualizar Apenas Title da Postagem Sucesso
	Dado que possuo valor <id> para campo "id"
	Quando consulto uma postagem por id
	E que possuo valor <title> para campo "title"
	E salvo os dados da postagem consultada
	E atualizo uma postagem
	Então  verifico status code 200
	E verifico no body "$" que há o campo "id"
	E verifico que o valor do campo "id" é <id>
	E verifico no body "$" que há o campo "title"
	E verifico que o valor do campo "title" é "<title>"
	Exemplos:
	| id | title          |
	| 1  | testeAtualizar |
	| 1  | !@$%¨&*()_+' |

Cenário: Validar Atualizar Apenas Body da Postagem Sucesso
	Dado que possuo valor <id> para campo "id"
	Quando consulto uma postagem por id
	E que possuo valor <body> para campo "body"
	E salvo os dados da postagem consultada
	E atualizo uma postagem
	Então  verifico status code 200
	E verifico no body "$" que há o campo "id"
	E verifico que o valor do campo "id" é <id>
	E verifico no body "$" que há o campo "body"
	E verifico que o valor do campo "body" é "<body>"
	Exemplos:
	| id | body                                                                |
	| 1  | Atualizado: Lorem ipsum dolor sit amet, consectetur adipiscing elit |
	| 1  | !@$%¨&*()_+' |

Cenário: Validar Atualizar Apenas UserId da Postagem Sucesso
	Dado que possuo valor <id> para campo "id"
	Quando consulto uma postagem por id
	E que possuo valor <userId> para campo "userId"
	E salvo os dados da postagem consultada
	E atualizo uma postagem
	Então  verifico status code 200
	E verifico no body "$" que há o campo "id"
	E verifico que o valor do campo "id" é <id>
	E verifico no body "$" que há o campo "userId"
	E verifico que o valor do campo "userId" é <userId>
	Exemplos:
	| userId | id |
	| 1      | 1  |

Cenário: Validar Erro ID no Path com Valor Inválido
	Dado que possuo id de uma postagem para atualizar <id>
	E que possuo valor <userId> para campo "userId"
	E que possuo valor <title> para campo "title"
	E que possuo valor <body> para campo "body"
	E atualizo uma postagem
	Então  verifico status code 500
	Exemplos:
	| userId | id   | title          | body                                                                |
	| 1      | 9999 | testeAtualizar | Atualizado: Lorem ipsum dolor sit amet, consectetur adipiscing elit |
	| 1      | abc  | testeAtualizar | Atualizado: Lorem ipsum dolor sit amet, consectetur adipiscing elit |
