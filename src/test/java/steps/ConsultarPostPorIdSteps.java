package steps;

import io.cucumber.java.pt.Quando;
import tests.ConsultarPostPorIdTests;

public class ConsultarPostPorIdSteps {
	@Quando("consulto uma postagem por id")
	public void consulto_uma_postagem_por_id() {
	    ConsultarPostPorIdTests.consultarPostagemId();
	}
}
