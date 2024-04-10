package aula10;

import java.util.Scanner;

public class multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe um valor: ");
		a = ler.nextDouble();
		
		System.out.println(a % 5 == 0 ? "o numero" + a + "é multiplo de 5" : "o numero" + a + "nao é multiplo de 5");
		ler.close();
	}

}
