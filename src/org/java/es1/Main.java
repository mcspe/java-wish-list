package org.java.es1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Esercizio 1
		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean addItem = true;
//		List<String> wishList = new ArrayList<>();
//		
//		while(addItem) {
//
//			System.out.print("Inserisci il regalo da aggiungere alla lista: ");
//			String present = sc.nextLine();
//			wishList.add(present);
//			
//			System.out.println("La tua lista contiene " + wishList.size() + "elementi. Vuoi aggiungere un altro regalo? (Y/N)");
//			String addItemAnswer = sc.nextLine().trim().toLowerCase();
//			if (!(addItemAnswer.equals("y"))) addItem = false;
//			
//		}
//		
//		sc.close();
//		
//		System.out.println("\n------------\n");
//		System.out.println("Lista regali");
//		System.out.println("\n------------\n");
//		
//		for (String value : wishList) {
//			System.out.println(value);			
//		}
		
		// Bonus
		
		Scanner sc = new Scanner(System.in);
		
		boolean addItem = true;
		List<Regalo> wishList = new ArrayList<>();
		
		while(addItem) {

			System.out.print("Inserisci il regalo da aggiungere alla lista: ");
			String present = sc.nextLine();
			System.out.print("Inserisci il destinatario del regalo: ");
			String recipient = sc.nextLine();
			Regalo presentObj = new Regalo(present, recipient);
			wishList.add(presentObj);
			
			System.out.println("La tua lista contiene " + wishList.size() + "elementi. Vuoi aggiungere un altro regalo? (Y/N)");
			String addItemAnswer = sc.nextLine().trim().toLowerCase();
			if (!(addItemAnswer.equals("y"))) addItem = false;
			
		}
		
		sc.close();
		
		System.out.println("\n------------\n");
		System.out.println("Lista regali");
		System.out.println("\n------------\n");
		
		for (Regalo value : wishList) {
			System.out.println(value);			
		}

	}

}
