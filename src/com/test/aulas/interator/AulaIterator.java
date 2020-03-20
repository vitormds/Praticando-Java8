package com.test.aulas.interator;

import java.util.ArrayList;
import java.util.Iterator;

public class AulaIterator {
	/*Com o Iterator voce consegue manipular e exibir 
	 * os valores, com o ForEach você apenas lista, vai
	 *  depender da sua situação.﻿*/
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Pedro");
		nomes.add("Thiago");
		nomes.add("João");
		
		Iterator<String> list = nomes.iterator();
		while(list.hasNext()) {
			String newlist = list.next();
			System.out.println(newlist);
		}
	}



}
