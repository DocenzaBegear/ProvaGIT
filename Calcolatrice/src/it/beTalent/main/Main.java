package it.beTalent.main;

import it.beTalent.calcolatrice.Calcolatrice;

public class Main {

	public static void main(String[] args) {
		
		Calcolatrice calc = new Calcolatrice();
		int a = 2;
		int b = 3;
		int c = 5;
		
		int somma = calc.somma(a, b, c);
		
		System.out.println(somma);

	}

}
