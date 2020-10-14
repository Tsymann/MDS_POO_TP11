package fr.mds.TP11;

import fr.mds.TP11.utils.Conjugateur;
import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conjugateur conj = new Conjugateur();
		String input = "1";
		
		conj.toutConjugue();
		
		System.out.println("entre un verbe du premier groupe non-irrégulier, 0 pour arreter");
		input = sc.nextLine();
		
		while(!input.equals("0")) {
			conj.conjugueAvecSaisi(input);
			System.out.println("entre un verbe du premier groupe non-irrégulier, 0 pour arreter");
			input = sc.nextLine();
		}
		System.out.println("fin des conjugaisons");
	}
}
