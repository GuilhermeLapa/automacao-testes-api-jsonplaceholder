package util;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

public class Utils {
	public static String obterUrl(String endpoint) {
		String resultado= null;
		JSONObject jsonObj;
		
		//conteúdo do arquivo json em um objeto json
		jsonObj= Utils.obterJson();
		//selecionamos a url desejada conforme parâmetro
		resultado= jsonObj.get(endpoint).toString();
		
		return resultado;
	}
	
	private static JSONObject obterJson() {
		String linha;
		boolean fimArq= false;
		JSONObject resultado= null;
		StringBuilder stringJson= new StringBuilder();
		
		try {
			//leitura do arquivo json
			FileReader arquivoJson= new FileReader("./src/test/resources/properties/urls.json");
			BufferedReader leitorArquivo= new BufferedReader(arquivoJson);
			while(!fimArq) {
				linha= leitorArquivo.readLine();
				if(linha == null) {
					fimArq= true;
				}
				else {
					stringJson.append(linha);
				}
			}
			//conteúdo do arquivo json em um objeto json
			resultado= new JSONObject(stringJson.toString());
			
			leitorArquivo.close();
			arquivoJson.close();
		}
		catch(Exception e) {
			System.out.println("Falha ao obter URL.\n" + e.getMessage());
		}
		
		return resultado;
	}
}
