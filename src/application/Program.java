package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); 
		System.out.println(c1 == c2); // false = compara as referências de memória por isto da 'false'
		System.out.println(s1 == s2); // true = compara a expressão literal de forma especial para literais 
		System.out.println(s3 == s4); // false = compara os objetos como distintos

	}

}
