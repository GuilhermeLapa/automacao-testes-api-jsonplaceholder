package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import tests.CriarPostagemTests;

public class CriarPostagemSteps {
	@Dado("que possuo valor {} para campo {string}")
	public void que_possuo_valor_para_campo(Object valor, String nomeCampo) {
	    CriarPostagemTests.inicializarBodyRequest(valor, nomeCampo);
	}
	@Quando("crio uma nova postagem")
	public void crio_uma_nova_postagem() {
		CriarPostagemTests.criarPostagem();
	}
}
