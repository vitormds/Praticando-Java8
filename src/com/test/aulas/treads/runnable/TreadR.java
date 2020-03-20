package com.test.aulas.treads.runnable;

import java.util.ArrayList;

public class TreadR implements Runnable{
private String nome;
private int tempo;

	public TreadR(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
	}
	@Override
	public void run() {
		
		for(int i=0; i<6; i++) {
			System.out.println(nome + " contador " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nome + " terminou a execução");
	}
	
}
