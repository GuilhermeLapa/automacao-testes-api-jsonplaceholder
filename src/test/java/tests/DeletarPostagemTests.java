package tests;

import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class DeletarPostagemTests extends Requisicoes {
	private static final String urlDeletarPostagem= "https://jsonplaceholder.typicode.com/posts/";
	private static Object idPost= null;
	
	public static void deletarPostagem() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(urlDeletarPostagem + DeletarPostagemTests.idPost);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		DeletarPostagemTests.response= request.delete();
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
