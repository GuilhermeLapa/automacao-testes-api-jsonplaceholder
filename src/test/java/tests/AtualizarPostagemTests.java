package tests;

import static org.junit.Assert.fail;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class AtualizarPostagemTests extends Requisicoes {
	private static final String urlAtualizarPostagem= "https://jsonplaceholder.typicode.com/posts/";
	private static Object idPost= null;
	
	public static void atualizarPostagem() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(AtualizarPostagemTests.urlAtualizarPostagem + AtualizarPostagemTests.idPost);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		request.body(AtualizarPostagemTests.bodyRequest.toJSONString());
		AtualizarPostagemTests.response= null;
		AtualizarPostagemTests.response= request.put();
	}
	
	public static void inicializarValorId(Object valorId) {
		try {
			 AtualizarPostagemTests.idPost= (int) valorId;
		}
		catch(Exception e) {
			 AtualizarPostagemTests.idPost= (String) valorId;
		}
	}
	
	public static void inicializarValorId() {
		if(AtualizarPostagemTests.bodyResponse != null) {
			AtualizarPostagemTests.idPost= (int) AtualizarPostagemTests.bodyResponse.get("id");
		}
		else {
			fail("Erro: Consulta não retornou id da postagem.");
		}
	}
}
