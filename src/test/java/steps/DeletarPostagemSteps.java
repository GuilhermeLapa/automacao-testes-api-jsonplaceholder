package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import tests.DeletarPostagemTests;

public class DeletarPostagemSteps {
	@Quando("deleto uma postagem por id")
	public void deleto_uma_postagem_por_id() {
	    DeletarPostagemTests.deletarPostagem();
	}
	@Dado("que possuo id de uma postagem para deletar {}")
	public void que_possuo_id_de_uma_postagem_para_deletar(Object valorId) {
	    DeletarPostagemTests.inicializarValorId(valorId);
	}
}
