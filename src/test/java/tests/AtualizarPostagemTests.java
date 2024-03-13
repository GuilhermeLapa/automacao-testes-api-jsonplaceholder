package tests;

import static org.junit.Assert.fail;

import org.json.simple.JSONObject;

import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class AtualizarPostagemTests extends Requisicoes {
	private static final String urlAtualizarPostagem= "https://jsonplaceholder.typicode.com/posts/";
	
	private static Object idPost= null;
	
	public static void atualizarPostagem() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(urlAtualizarPostagem + AtualizarPostagemTests.idPost);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		request.body(AtualizarPostagemTests.bodyRequest.toJSONString());
		AtualizarPostagemTests.response= null;
		AtualizarPostagemTests.response= request.put();
	}
	
	public static void salvarDadosPostagemConsultada() {
		if(CriarPostagemTests.bodyResponse == null) {
			CriarPostagemTests.bodyResponse= new JSONObject();
		}
		
		if(AtualizarPostagemTests.response != null) {
			AtualizarPostagemTests.bodyResponse.put("id", AtualizarPostagemTests.response.getBody().jsonPath().getInt("id"));
			idPost= (Integer) AtualizarPostagemTests.bodyResponse.get("id");
			AtualizarPostagemTests.bodyResponse.put("userId", AtualizarPostagemTests.response.getBody().jsonPath().getInt("userId"));
			AtualizarPostagemTests.bodyResponse.put("title", AtualizarPostagemTests.response.getBody().jsonPath().getString("title"));
			AtualizarPostagemTests.bodyResponse.put("body", AtualizarPostagemTests.response.getBody().jsonPath().getString("body"));
		}
		else {
			fail("Consulta da postagem não realizada para atualização.");
		}
	}
	
	public static void inicializarValorId(Object valorId) {
		try {
			idPost= (int) valorId;
		}
		catch(Exception e) {
			idPost= (String) valorId;
		}
	}
}
