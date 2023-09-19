package Desafio;

public class Logicos {
	public static void main(String[] args) {
		{

			boolean trabalho321 = true;
			boolean trabalho322 = false;

			System.out.println("TV de 32");
			System.out.println(trabalho321 || trabalho322);
			System.out.println(trabalho321 ^ trabalho322); 

		}

			boolean trabalho501 = true;
			boolean trabalho502 = true;

			System.out.println(" ");
			System.out.println("TV de 50");
			System.out.println(trabalho501 && trabalho502);

		{

			boolean trabalhoS1 = true;
			boolean trabalhoS2 = false;

			System.out.println(" ");
			System.out.println("Tomar sorvete");
			System.out.println(!trabalhoS2 && trabalhoS1);
			System.out.println(trabalhoS1 || trabalhoS2);
			System.out.println(trabalhoS1 ^ trabalhoS2);

		}
	}
}
