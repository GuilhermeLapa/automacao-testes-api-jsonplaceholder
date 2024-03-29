package tests;

import org.junit.Assert;
import core.Requisicoes;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;
import util.Utils;

public class ConsultarListaUsuariosTests extends Requisicoes {
	private static final String urlListaUsuarios= Utils.obterUrl("users");
	
	public static void consultarListaUsuarios() {
		RequestSpecification request= RestAssured.given();
		request.baseUri(ConsultarListaUsuariosTests.urlListaUsuarios);
		Header header= new Header("Content-Type", "application/json");
		request.header(header);
		ConsultarListaUsuariosTests.response= request.get();
	}
	
	public static void verificarStatusCode(int statusCodeEsperado) {
		int statusCodeResponse= ConsultarListaUsuariosTests.response.statusCode();
		Assert.assertTrue(statusCodeResponse == statusCodeEsperado);
	}
	
	public static void verificarListaBodyResponse(String jsonPathLista) {
		Assert.assertTrue(ConsultarListaUsuariosTests.response.getBody().jsonPath().getList(jsonPathLista).size() > 1);
	}
	
	public static void verificarCampoBodyResponse(String jsonPath, String nomeCampo) {
		Assert.assertTrue(ConsultarListaUsuariosTests.response.getBody().jsonPath().get(jsonPath).toString().contains(nomeCampo));
	}
	
	public static void verificarValorCampoNumerico(String jsonPathCampo, float valorEsperado) {
		float valorResponse= ConsultarListaUsuariosTests.response.getBody().jsonPath().getFloat(jsonPathCampo);
		Assert.assertTrue(valorResponse == valorEsperado);
	}
	
	public static void verificarValorCampoString(String jsonPathCampo, String valorEsperado) {
		String valorResponse= ConsultarListaUsuariosTests.response.getBody().jsonPath().getString(jsonPathCampo).toString();
		Assert.assertEquals(valorEsperado, valorResponse);
	}
}
