package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import tests.AtualizarPostagemTests;

public class AtualizarPostagemSteps {
	@Quando("atualizo uma postagem")
	public void atualizo_uma_postagem() {
	    AtualizarPostagemTests.atualizarPostagem();
	}
	@E("salvo os dados da postagem consultada")
	public void salvo_os_dados_da_postagem_consultada() {
		AtualizarPostagemTests.salvarDadosPostagemConsultada();
	}
	@Dado("que possuo id de uma postagem para atualizar {}")
	public void que_possuo_id_de_uma_postagem_para_atualizar(Object valorId) {
	    AtualizarPostagemTests.inicializarValorId(valorId);
	}
}
