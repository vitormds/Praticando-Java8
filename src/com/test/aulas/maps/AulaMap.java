package com.test.aulas.maps;

import java.util.HashMap;
import java.util.Map;

/*values() - É uma Collection com todos os valores que foram associados a alguma das chaves.
keySet() - Retorna um Set com as chaves do mapa especificado.
entrySet() - Retorna um conjunto de Maps contido no mapa configurado, podendo ser possível acessar suas chaves e valores.
put (Key key, Value value) - Associa um valor a uma chave específica.*/

public class AulaMap {

	public static void main(String[] args) {
		// se quiser ordernar é só colocar o LinkedHashMap no lugar de HashMap
		Map<String, String> map = new HashMap<>();
		map.put("car", "carro");
		map.put("moto ride", "moto");
		map.put("cas", "casa");
		map.put("cas", "casa");
		// pegando as chaves
		for (String m : map.values()) {
			System.out.println(m);
		}
		// pegar chave e valor
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() );
		}
		
		
	}

}
