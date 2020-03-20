package com.test.aulas.stream;

import java.util.Arrays;
import java.util.List;

public class ClasseStream {
		
		public static void main(String[] args) {
			List<String> list = Arrays.asList
					("Santa catarina", "Paraná", "São Paulo", "Rio de Janeiro", "Brasilia", "Ceará");
			//list.forEach(x -> System.out.println(x));
			list.forEach(System.out::println);
		}
}
