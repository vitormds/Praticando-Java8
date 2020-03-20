package com.test.aulas.sets;

import java.util.HashSet;
import java.util.Set;
/*hashSet() nao garante nenhum tipo de ordenacao. 
 * O desempenho aqui é bastante alto,
 *  pois usa o hashCode(), para identificacao */
public class SetTest{
	public static void main(String[] agrs){
		boolean[] ba = new boolean[4];
		//crio meu objeto set
		Set s = new HashSet();
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("a");
	//	ba[3] = s.add(new Object());
			for(int x = 0; x < ba.length; x++)
				System.out.print(ba[x] + " ");
				System.out.println("\n");
			//imprima os objetos
			for(Object o : s)
			 System.out.println(o + " ");
	}
}
