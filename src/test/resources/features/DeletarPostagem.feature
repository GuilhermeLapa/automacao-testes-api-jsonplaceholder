# language: pt
#encoding iso-8859-1

@Testar
Funcionalidade: DELETE - Deletar postagem por Id

### CENÁRIO PRESSUPÕE QUE EXISTA POSTAGEM PARA EXCLUIR ###
Cenário: Validar Deletar postagem por Id Sucesso
	Dado que possuo id de uma postagem para deletar <id>
	Quando deleto uma postagem por id
	Então verifico status code 200
	Exemplos:
	| id |
	| 1  |

### CENÁRIO CRIA POSTAGEM PARA GARANTIR O TESTE DE EXCLUIR ###
Cenário: Validar Deletar postagem por Id Sucesso
	Dado que possuo valor <userId> para campo "userId"
	E que possuo valor <id> para campo "id"
	E que possuo valor "<title>" para campo "title"
	E que possuo valor "<body>" para campo "body"
	Quando crio uma nova postagem
	E salvo o id da postagem cadastrada para deletar
	E deleto uma postagem por id
	Então verifico status code 200
	Exemplos:
	| userId | id  | title | body                                                    |
	| 1      | 101 | teste | Lorem ipsum dolor sit amet, consectetur adipiscing elit |
