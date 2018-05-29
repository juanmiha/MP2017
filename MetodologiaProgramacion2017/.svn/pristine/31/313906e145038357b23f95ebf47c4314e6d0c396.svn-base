package org.mp.tema04;
import java.util.StringTokenizer;

public class EjemploStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expresion = "5  1 +";
		StringTokenizer tokenizer = new StringTokenizer(expresion, "+*-/ ", true);
		System.out.println("La expresión tiene " + tokenizer.countTokens() + " token" + "\n");
		int i = 0;
		while (tokenizer.hasMoreTokens()) {
			i++;
			System.out.println("token " +i + "=> " + tokenizer.nextToken());
		}
	}

}
