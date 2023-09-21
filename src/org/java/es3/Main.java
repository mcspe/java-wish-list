package org.java.es3;

public class Main {

	public static void main(String[] args) {
		
		// Esercizio 3
		
		int[] a = {1, 2, 3, 4, 5, 6, 7};

		ElencoInt prova = new ElencoInt(a);
					
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
//		System.out.println(prova.getElementoSuccessivo());
		
		while(prova.hasAncoraElementi()) {
			System.out.println(prova.getElementoSuccessivo());
		}
		
		// Bonus
		
		ElencoInt provaBonus = new ElencoInt();		
		System.out.println(provaBonus);
		
		provaBonus.addElemento(1);
		System.out.println(provaBonus);
		provaBonus.addElemento(2);
		System.out.println(provaBonus);
		provaBonus.addElemento(3);
		System.out.println(provaBonus);

	}

}
