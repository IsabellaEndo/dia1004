package aula10;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		// TODO Auto-generated method stub
		int salario;
		int tempo;
		double bonusCinco;
		double bonusSete;
		
		System.out.print("Informe seu salario:  ");
		salario = ler.nextInt();
		
		System.out.print ("Informe quanto tempo de empresa voce tem: ");
		tempo = ler.nextInt();
		System.out.println();
		
		if ( tempo <= 3) {
		System.out.println (" Seu bonus é de 5% ");
		System.out.println ();
		}
		
		else if (tempo > 3){
			System.out.println("Seu bonus é de 7%");
			System.out.println();
		}
			
		bonusCinco= (salario)* 0.05;
		System.out.println("**** Seu bonus com até 3 anos de empresa é de "+ bonusCinco);
		
		bonusSete = (salario)* 0.07;
		System.out.println("**** Seu bonus com mais de 3 anos de empresa é de "+ bonusSete);
	
	

	}

}
