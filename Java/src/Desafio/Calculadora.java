package Desafio;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		double num1 = ent.nextDouble();
		
		System.out.print("Informe um número: ");
		double num2 = ent.nextDouble();
		
		System.out.print("Informe a operação: ");
		String opera = ent.next();
		
		double resultado = "+".equals(opera) ? num1 + num2 : 0;
		resultado = "-".equals(opera) ? num1 - num2 : resultado;
		resultado = "*".equals(opera) ? num1 * num2 : resultado;
		resultado = "/".equals(opera) ? num1 / num2 : resultado;
		resultado = "%".equals(opera) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, opera, num2, resultado);
		
		ent.close();
		
	}

}
