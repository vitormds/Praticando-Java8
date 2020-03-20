package com.test.aulas.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class ClassePredicate {
	
	public static void filtro(List<String> lista, Predicate<String> condicao){
		for(String s : lista) {
			if(condicao.test(s)) {
				System.out.println(s);
			}
			
		}
	}
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Bahia","Natal","São Paulo","Ceará","Rio de Janeiro");
		System.out.println("Estamos iniciando com a letra S");
		filtro(list1, (s) -> s.startsWith("S"));
		System.out.println("Estamos iniciando com a letra a");
		filtro(list1, (s) -> s.endsWith("a"));
		System.out.println("Imprimir toda lista");
		filtro(list1, (s) -> true);
		System.out.println("Não Imprimir lista");
		filtro(list1, (s) -> false);
		System.out.println("Imprimi os nomes com mais de +10 caracteres");
		filtro(list1, (s) -> s.length()>10);
		
	}
}
