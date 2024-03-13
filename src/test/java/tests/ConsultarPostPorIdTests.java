package tests;

import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class ConsultarPostPorIdTests extends Requisicoes {
	private static final String urlConsultaPostagemId= "https://jsonplaceholder.typicode.com/posts/";
	
	public static void consultarPostagemId() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(urlConsultaPostagemId + Requisicoes.bodyRequest.get("id").toString());
		Header header= new Header("Constant-Type", "application/json");
		request.header(header);
		ConsultarPostPorIdTests.response= request.get();
	}
}
