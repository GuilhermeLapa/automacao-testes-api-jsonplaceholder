package tests;

import org.junit.Assert;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class ConsultarListaUsuariosTests extends Requisicoes {
	private static final String urlListaUsuarios= "https://jsonplaceholder.typicode.com/users";
	
	public static void consultarListaUsuarios() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(urlListaUsuarios);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		ConsultarListaUsuariosTests.response= request.get();
	}
	
	public static void verificarStatusCode(int statusCode) {
		Assert.assertTrue(response.statusCode() == statusCode);
	}
	
	public static void verificarListaBodyResponse(String jsonPathLista) {
		Assert.assertTrue(response.getBody().jsonPath().getList(jsonPathLista).size() > 1);
	}
	
	public static void verificarCampoBodyResponse(String jsonPath, String nomeCampo) {
		Assert.assertTrue(response.getBody().jsonPath().get(jsonPath).toString().contains(nomeCampo));
	}
	
	public static void verificarValorCampoInteiro(String jsonPathCampo, float valor) {
		Assert.assertTrue(valor == response.getBody().jsonPath().getFloat(jsonPathCampo));
	}
	
	public static void verificarValorCampoString(String jsonPathCampo, String valor) {
		Assert.assertEquals(valor, response.getBody().jsonPath().get(jsonPathCampo).toString());
	}
}
