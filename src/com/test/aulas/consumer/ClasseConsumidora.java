package com.test.aulas.consumer;


import java.util.function.Consumer;





public class ClasseConsumidora {
	
	public static void main(String[] args) {
		 int j = 99;
	      
	      Consumer<Integer> myConsumer = (y) -> 
	      {
	          
	          System.out.println("y = " + y);
	      };

	      myConsumer.accept(j);
 		 
	}
	
}
