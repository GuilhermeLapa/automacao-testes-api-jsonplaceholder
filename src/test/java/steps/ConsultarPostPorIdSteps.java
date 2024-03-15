package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import tests.ConsultarPostPorIdTests;

public class ConsultarPostPorIdSteps {
	@Quando("consulto uma postagem por id")
	public void consulto_uma_postagem_por_id() {
	    ConsultarPostPorIdTests.consultarPostagemId();
	}
	@E("salvo os dados da postagem consultada")
	public void salvo_os_dados_da_postagem_consultada() {
		ConsultarPostPorIdTests.salvarDadosPostagemConsultada();
	}
	@E("salvo o id da postagem cadastrada para consultar")
	public void salvo_o_id_da_postagem_cadastrada_para_consultar() {
		ConsultarPostPorIdTests.salvarIdDaPostagemCadastrada();
	}
}
