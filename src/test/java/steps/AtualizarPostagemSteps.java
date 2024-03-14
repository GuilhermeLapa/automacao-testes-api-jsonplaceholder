package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import tests.AtualizarPostagemTests;

public class AtualizarPostagemSteps {
	@Quando("atualizo uma postagem")
	public void atualizo_uma_postagem() {
	    AtualizarPostagemTests.atualizarPostagem();
	}
	@Dado("que possuo id de uma postagem para atualizar {}")
	public void que_possuo_id_de_uma_postagem_para_atualizar(Object valorId) {
	    AtualizarPostagemTests.inicializarValorId(valorId);
	}
	@Dado("que possuo id de uma postagem consultada para atualização")
	public void que_possuo_id_de_uma_postagem_consultada_para_atualizacao() {
	    AtualizarPostagemTests.inicializarValorId();
	}
}
