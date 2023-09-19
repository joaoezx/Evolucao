package Desafio;

import java.util.Scanner;

public class Conversão {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		
		System.out.print("Salario 1 = ");
		String a = ent.nextLine().replace(",",".");
		System.out.print("Salario 2 = ");
		String b = ent.nextLine().replace(",",".");		
		System.out.print("Salario 3 = ");
		String c = ent.nextLine().replace(",",".");
		
		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		double c1 = Double.parseDouble(c);
		
		double media = (a1 + b1 + c1) / 3;
		
		System.out.println("\na média é " + media);
		
		ent.close();
	}

}
