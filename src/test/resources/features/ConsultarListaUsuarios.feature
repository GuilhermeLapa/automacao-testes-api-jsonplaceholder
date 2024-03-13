# language: pt
#encoding iso-8859-1

@Testar
Funcionalidade: GET - Listar todos os usuários

Cenário: Validar Consultar Lista de Produtos Sucesso
	Quando consulto a lista de produtos
	Então  verifico status code 200
	E verifico que há uma lista no body "$"
	E verifico no body "[0]" que há o campo "id"
	E verifico que o valor do campo "[0].id" é 1
	E verifico no body "[0]" que há o campo "name"
	E verifico que o valor do campo "[0].name" é "Leanne Graham"
	E verifico no body "[0]" que há o campo "username"
	E verifico que o valor do campo "[0].username" é "Bret"
	E verifico no body "[0]" que há o campo "email"
	E verifico que o valor do campo "[0].email" é "Sincere@april.biz"
	E verifico no body "[0]" que há o campo "address"
	E verifico no body "[0].address" que há o campo "street"
	E verifico que o valor do campo "[0].address.street" é "Kulas Light"
	E verifico no body "[0].address" que há o campo "suite"
	E verifico que o valor do campo "[0].address.suite" é "Apt. 556"
	E verifico no body "[0].address" que há o campo "city"
	E verifico que o valor do campo "[0].address.city" é "Gwenborough"
	E verifico no body "[0].address" que há o campo "zipcode"
	E verifico que o valor do campo "[0].address.zipcode" é "92998-3874"
	E verifico no body "[0].address" que há o campo "geo"
	E verifico no body "[0].address.geo" que há o campo "lat"
	E verifico que o valor do campo "[0].address.geo.lat" é "-37.3159"
	E verifico no body "[0].address.geo" que há o campo "lng"
	E verifico que o valor do campo "[0].address.geo.lng" é "81.1496"
	E verifico no body "[0]" que há o campo "phone"
	E verifico que o valor do campo "[0].phone" é "1-770-736-8031 x56442"
	E verifico no body "[0]" que há o campo "website"
	E verifico que o valor do campo "[0].website" é "hildegard.org"
	E verifico no body "[0]" que há o campo "company"
	E verifico no body "[0].company" que há o campo "name"
	E verifico que o valor do campo "[0].company.name" é "Romaguera-Crona"
	E verifico no body "[0].company" que há o campo "catchPhrase"
	E verifico que o valor do campo "[0].company.catchPhrase" é "Multi-layered client-server neural-net"
	E verifico no body "[0].company" que há o campo "bs"
	E verifico que o valor do campo "[0].company.bs" é "harness real-time e-markets"
	E verifico no body "[1]" que há o campo "id"
	E verifico que o valor do campo "[1].id" é 2
	E verifico no body "[1]" que há o campo "name"
	E verifico que o valor do campo "[1].name" é "Ervin Howell"
	E verifico no body "[1]" que há o campo "username"
	E verifico que o valor do campo "[1].username" é "Antonette"
	E verifico no body "[1]" que há o campo "email"
	E verifico que o valor do campo "[1].email" é "Shanna@melissa.tv"
	E verifico no body "[1]" que há o campo "address"
	E verifico no body "[1].address" que há o campo "street"
	E verifico que o valor do campo "[1].address.street" é "Victor Plains"
	E verifico no body "[1].address" que há o campo "suite"
	E verifico que o valor do campo "[1].address.suite" é "Suite 879"
	E verifico no body "[1].address" que há o campo "city"
	E verifico que o valor do campo "[1].address.city" é "Wisokyburgh"
	E verifico no body "[1].address" que há o campo "zipcode"
	E verifico que o valor do campo "[1].address.zipcode" é "90566-7771"
	E verifico no body "[1].address" que há o campo "geo"
	E verifico no body "[1].address.geo" que há o campo "lat"
	E verifico que o valor do campo "[1].address.geo.lat" é "-43.9509"
	E verifico no body "[1].address.geo" que há o campo "lng"
	E verifico que o valor do campo "[1].address.geo.lng" é "-34.4618"
	E verifico no body "[1]" que há o campo "phone"
	E verifico que o valor do campo "[1].phone" é "010-692-6593 x09125"
	E verifico no body "[1]" que há o campo "website"
	E verifico que o valor do campo "[1].website" é "anastasia.net"
	E verifico no body "[1]" que há o campo "company"
	E verifico no body "[1].company" que há o campo "name"
	E verifico que o valor do campo "[1].company.name" é "Deckow-Crist"
	E verifico no body "[1].company" que há o campo "catchPhrase"
	E verifico que o valor do campo "[1].company.catchPhrase" é "Proactive didactic contingency"
	E verifico no body "[1].company" que há o campo "bs"
	E verifico que o valor do campo "[1].company.bs" é "synergize scalable supply-chains"
	
	
	
	
	
	
	
	
	
	
	