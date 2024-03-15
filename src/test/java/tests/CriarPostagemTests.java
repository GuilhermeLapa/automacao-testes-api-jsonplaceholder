package tests;

import org.json.simple.JSONObject;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class CriarPostagemTests extends Requisicoes {
	public static final String urlCriarPostagem= "https://jsonplaceholder.typicode.com/posts";
	
	public static void criarPostagem() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(CriarPostagemTests.urlCriarPostagem);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		request.body(CriarPostagemTests.bodyRequest.toJSONString());
		CriarPostagemTests.response= request.post();
		CriarPostagemTests.salvarBodyResponseCriarPostagem();
	}
	
	public static void inicializarBodyRequest(Object valor, String nomeCampo) {
		if(CriarPostagemTests.bodyRequest == null) {
			CriarPostagemTests.bodyRequest= new JSONObject();
		}
		
		try {
			CriarPostagemTests.bodyRequest.put(nomeCampo, (int) valor);
		}
		catch(Exception e) {
			CriarPostagemTests.bodyRequest.put(nomeCampo, (String) valor);
		}
	}
	
	private static void salvarBodyResponseCriarPostagem() {
		if(CriarPostagemTests.response != null) {
			CriarPostagemTests.bodyResponse= new JSONObject();
			CriarPostagemTests.bodyResponse.put("id", (int) CriarPostagemTests.response.getBody().jsonPath().getInt("id"));
			CriarPostagemTests.bodyResponse.put("userId", (int) CriarPostagemTests.response.getBody().jsonPath().getInt("userId"));
			CriarPostagemTests.bodyResponse.put("title", (String) CriarPostagemTests.response.getBody().jsonPath().getString("title"));
			CriarPostagemTests.bodyResponse.put("body", (String) CriarPostagemTests.response.getBody().jsonPath().getString("body"));
		}
	}
}
