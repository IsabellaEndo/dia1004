package aula10;

import java.util.Scanner;

public class verificarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		System.out.println("escolha um numero entre 1 e 4:");
		int numero = ler.nextInt();

		switch (numero) {
		
		case 1: 
			System.out.println("o numero escolhido foi 1");
			break;
			
		case 2: 
			System.out.println("o numero escolhido foi 2");
			break;

		case 3: 
			System.out.println("o numero escolhido foi 3");
			break;

		case 4: 
			System.out.println("o numero escolhido foi 4");
			break;

		default:
			System.out.println ("o numero é invalido! digite entre 1 a 4");

		}



	}

}
