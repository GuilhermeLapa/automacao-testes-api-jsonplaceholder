package tests;

import static org.junit.Assert.fail;
import org.json.simple.JSONObject;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class ConsultarPostPorIdTests extends Requisicoes {
	private static final String urlConsultaPostagemId= "https://jsonplaceholder.typicode.com/posts/";
	
	public static void consultarPostagemId() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(ConsultarPostPorIdTests.urlConsultaPostagemId + ConsultarPostPorIdTests.bodyRequest.get("id").toString());
		Header header= new Header("Constant-Type", "application/json");
		request.header(header);
		ConsultarPostPorIdTests.response= request.get();
	}
	
	public static void salvarDadosPostagemConsultada() {
		if(ConsultarPostPorIdTests.bodyResponse == null) {
			ConsultarPostPorIdTests.bodyResponse= new JSONObject();
		}
		
		if(ConsultarPostPorIdTests.response != null) {
			ConsultarPostPorIdTests.bodyResponse.put("id", ConsultarPostPorIdTests.response.getBody().jsonPath().getInt("id"));
			//idPost= (Integer) AtualizarPostagemTests.bodyResponse.get("id");
			ConsultarPostPorIdTests.bodyResponse.put("userId", ConsultarPostPorIdTests.response.getBody().jsonPath().getInt("userId"));
			ConsultarPostPorIdTests.bodyResponse.put("title", ConsultarPostPorIdTests.response.getBody().jsonPath().getString("title"));
			ConsultarPostPorIdTests.bodyResponse.put("body", ConsultarPostPorIdTests.response.getBody().jsonPath().getString("body"));
		}
		else {
			fail("Erro: Consulta da postagem não realizada para atualização.");
		}
	}
}
