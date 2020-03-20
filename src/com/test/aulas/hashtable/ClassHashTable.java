package com.test.aulas.hashtable;

import java.util.Hashtable;

public class ClassHashTable {
	
	
	
	private Hashtable<String, Integer> pessoas = new Hashtable<>();
	
	

	
	public  void Run() {
		pessoas.put("Nelson Silva",21);
		pessoas.put("Maria Celeste", 37);
		pessoas.put("Pedro herique", 52);
		pessoas.put("Raquel Soares", 68);	
		
		//nova idade passa a ser 100
		pessoas.replace("Pedo Herique", 100);
		// apaga a key e a chave
		pessoas.remove("Maria Celeste");
		
		//limpar todas chaves e valores
		pessoas.clear();
		
		
		
		
		System.out.println(new StringBuilder()
				.append("Nome das pessoas: ")
				.append(pessoas.keySet()));
		
		System.out.println(new StringBuilder()
				.append("Idade das pessoas: ")
				.append(pessoas.values()));
		
	}
}
