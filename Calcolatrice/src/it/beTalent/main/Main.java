package it.beTalent.main;

import it.beTalent.calcolatrice.Calcolatrice;

public class Main {

	public static void main(String[] args) {
		
		Calcolatrice calc = new Calcolatrice();
		int a = 15;
		int b = 7;
		int c = 9;
		
		int somma = calc.somma(a, b, c);
		int sottraz = calc.sottrazione(a, b, c);
		int moltipl = calc.moltiplicazione(a, b, c);
		int divis = calc.divisione(a, b, c);

		System.out.println(somma);
		System.out.println(sottraz);
		System.out.println(moltipl);
		System.out.println(divis);
		
		System.out.println("Edited by Raffaele Ronga, thanks for the lessons!");
	}

}
