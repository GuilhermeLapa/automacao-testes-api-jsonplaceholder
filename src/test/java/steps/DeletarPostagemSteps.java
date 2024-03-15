package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
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
	@E("salvo o id da postagem cadastrada para deletar")
	public void salvo_o_id_da_postagem_cadastrada_para_deletar() {
	    DeletarPostagemTests.inicializarValorId();
	}
}
