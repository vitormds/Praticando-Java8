package com.test.aulas.interator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*Por exemplo se vc usar uma LinkedList com objetos nao ordenados
 *  o for get(i) percorrerá toda lista para encontrar tal objeto qnto 
 *  ao Iterator buscara esse objeto de forma mais rápida pulando de nó
 *   em nó ....
 *   
 *   Outra vantagem é que, a menos que você tenha uma lista imodificável,
 *    o Iterator permite que você remova um objeto enquanto está percorrento a lista.
 *    
 *   Você tem a garantia que o Iterator não vai se perder nos índices. Ele também
 *    vai remover da melhor forma possível.*/

public class IteratorOBJ {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(01, "varun", 21));
		list.add(new Employee(02, "deepak", 22));
		list.add(new Employee(03, "apple", 23));
		list.add(new Employee(04, "rohan", 24));

//		for (Employee employee : list) {
//			System.out.println(employee.age);
//		}

		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {
			Employee employee = itr.next();
			/*
			 * while (it.hasNext) {
			 *  obj = it.next(); 
			 *  if (canExclude(obj)) it.remove();
			 *   }
			 */
			System.out.print("age:" + employee.getAge() + "  ");
			 System.out.print("empid:"+employee.getEmpid()+ " ");
			 System.out.println("name:"+employee.getname()+ " ");
		}
	}
}
