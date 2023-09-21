package org.java.es2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il testo da analizzare: ");
		String text = sc.nextLine().trim().toLowerCase();
		
		sc.close();
		
		Map<Character, Integer> charCounter = new HashMap<>();
		for(int i = 0; i < text.length(); i++) {
			char k = text.charAt(i);
			if (charCounter.containsKey(k)) charCounter.put(k, charCounter.get(k) + 1);
			else charCounter.put(k, 1);
		}
		
		for(char c : charCounter.keySet()) System.out.println(c + ": " + charCounter.get(c));
		
	}

}
