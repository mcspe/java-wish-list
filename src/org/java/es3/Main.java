package org.java.es3;

public class Main {

	public static void main(String[] args) {
		
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

	}

}
