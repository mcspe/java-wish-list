package org.java.es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		// Esercizio 2

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il testo da analizzare: ");
		String text = sc.nextLine().trim().toLowerCase();
		
		sc.close();
		
//		Map<Character, Integer> charCounter = new HashMap<>();
//		for(int i = 0; i < text.length(); i++) {
//			char k = text.charAt(i);
//			if (charCounter.containsKey(k)) charCounter.put(k, charCounter.get(k) + 1);
//			else charCounter.put(k, 1);
//		}
//		
//		for(char c : charCounter.keySet()) System.out.println(c + ": " + charCounter.get(c));
		
		// Bonus
		
		List<Character> textCollection = new ArrayList<>();
		for(int i = 0; i < text.length(); i++) {
			char k = text.charAt(i);
			textCollection.add(k);
		}
		
		textCollection.stream()
    					.collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()))
    					.forEach((k, v) -> System.out.println("'" + k + "':" + v));
		
		System.out.println(textCollection);
		
		// Bonus cheats
		text.chars()
    	.mapToObj(c -> (char) c)
    	.map(Character::toLowerCase)
    	.collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()))
    	.forEach((k, v) -> System.out.println("'" + k + "':" + v));
		
	}

}
