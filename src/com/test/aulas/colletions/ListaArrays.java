package com.test.aulas.colletions;

import java.util.ArrayList;
import java.util.Collections;



public class ListaArrays {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = " Aula Trabalhando com Array";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		System.out.println(aulas);
		aulas.remove(0);
		System.out.println(aulas);
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		//Collections.sort(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
