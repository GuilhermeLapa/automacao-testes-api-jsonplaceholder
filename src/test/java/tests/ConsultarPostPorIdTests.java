package tests;

import static org.junit.Assert.fail;
import org.json.simple.JSONObject;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class ConsultarPostPorIdTests extends Requisicoes {
	private static final String urlConsultaPostagemId= "https://jsonplaceholder.typicode.com/posts/";
	public static Object idPostagem= null;
	
	public static void consultarPostagemId() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(ConsultarPostPorIdTests.urlConsultaPostagemId + ConsultarPostPorIdTests.bodyRequest.get("id").toString());
		Header header= new Header("Constant-Type", "application/json");
		request.header(header);
		ConsultarPostPorIdTests.response= request.get();
		ConsultarPostPorIdTests.salvarDadosPostagemConsultada();
	}
	
	public static void salvarIdDaPostagemCadastrada() {
		if(ConsultarPostPorIdTests.bodyResponse != null) {
			ConsultarPostPorIdTests.idPostagem= ConsultarPostPorIdTests.bodyResponse.get("id");
		}
		else {
			fail("Erro: Não foi possível salvar id da postagem cadastrada.");
		}
	}
	
	private static void salvarDadosPostagemConsultada() {
		if(ConsultarPostPorIdTests.response != null) {
			if(ConsultarPostPorIdTests.response.statusCode() == 200) {
				ConsultarPostPorIdTests.bodyResponse= new JSONObject();
				ConsultarPostPorIdTests.bodyResponse.put("id", ConsultarPostPorIdTests.response.getBody().jsonPath().getInt("id"));
				ConsultarPostPorIdTests.bodyResponse.put("userId", ConsultarPostPorIdTests.response.getBody().jsonPath().getInt("userId"));
				ConsultarPostPorIdTests.bodyResponse.put("title", ConsultarPostPorIdTests.response.getBody().jsonPath().getString("title"));
				ConsultarPostPorIdTests.bodyResponse.put("body", ConsultarPostPorIdTests.response.getBody().jsonPath().getString("body"));
			}
		}
		else {
			fail("Erro: Consulta da postagem não realizada para atualização.");
		}
	}
}
