package Desafio;

public class Aritmeticos {
	public static void main(String[] args) {
		int a1 =  6 * (3 + 2);
		int b1 = (1 - 5) * (2 - 7);
		int c1 = 3 * 2;
		int d1 = 10;
		int e = 2;
		double a2 = Math.pow(a1, 2);
		double h = a2 / c1;
		int j = b1 / e;
		double f = Math.pow(j , 2);
		System.out.print(h + " ");
		System.out.println(f + " " + d1);
		
		double f1 = h - f;
		System.out.println(f1 + " " + d1);
		
		double f2 = Math.pow(f1, 3);
		double d2 = Math.pow(d1, 3);
		System.out.println(f2/d2);
	}
}