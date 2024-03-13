package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import tests.ConsultarListaUsuariosTests;

public class ConsultarListaUsuariosSteps {
	@Quando("consulto a lista de produtos")
	public void consulto_a_lista_de_produtos() {
	    ConsultarListaUsuariosTests.consultarListaUsuarios();
	}
	@Então("verifico status code {int}")
	public void verifico_status_code(Integer statusCodeEsperado) {
		ConsultarListaUsuariosTests.verificarStatusCode(statusCodeEsperado);
	}
	@Então("verifico que há uma lista no body {string}")
	public void verifico_que_há_uma_lista_no_body(String jsonPathLista) {
		ConsultarListaUsuariosTests.verificarListaBodyResponse(jsonPathLista);
	}
	@Então("verifico no body {string} que há o campo {string}")
	public void verifico_no_body_que_há_o_campo(String jsonPath, String nomeCampo) {
		ConsultarListaUsuariosTests.verificarCampoBodyResponse(jsonPath, nomeCampo);
	}
	@Então("verifico que o valor do campo {string} é {float}")
	public void verifico_que_o_valor_do_campo_é(String jsonPathCampo, float valorEsperado) {
		ConsultarListaUsuariosTests.verificarValorCampoNumerico(jsonPathCampo, valorEsperado);
	}
	@Então("verifico que o valor do campo {string} é {string}")
	public void verifico_que_o_valor_do_campo_é(String jsonPathCampo, String valor) {
		ConsultarListaUsuariosTests.verificarValorCampoString(jsonPathCampo, valor);
	}
}
