package tests;

import static org.junit.Assert.fail;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;
import util.Utils;

public class DeletarPostagemTests extends Requisicoes {
	private static final String urlDeletarPostagem= Utils.obterUrl("posts");
	private static Object idPost= null;
	
	public static void deletarPostagem() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(DeletarPostagemTests.urlDeletarPostagem + DeletarPostagemTests.idPost);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		DeletarPostagemTests.response= request.delete();
	}
	
	public static void inicializarValorId(Object valorId) {
		try {
			DeletarPostagemTests.idPost= (int) valorId;
		}
		catch(Exception e) {
			DeletarPostagemTests.idPost= (String) valorId;
		}
	}
	
	public static void inicializarValorId() {
		if(DeletarPostagemTests.bodyResponse != null) {
			DeletarPostagemTests.idPost= DeletarPostagemTests.bodyResponse.get("id");
		}
		else {
			fail("Erro: Não foi possível salvar id da postagem cadastrada.");
		}
	}
}
