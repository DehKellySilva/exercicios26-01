package exercicioJava;

import java.util.Scanner;

public class contadorDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anos,meses,dias,cont;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o(s) ano(s): ");
		anos = leia.nextInt();
		System.out.println("\nDigite o(s) mes(es): ");
		meses = leia.nextInt();
		System.out.println("\nDigite o(s) dia(s): ");
		dias = leia.nextInt();
				
		
		dias = (dias+(anos*365)+(meses*30));
		
		System.out.println("\nA quantidade de dias são: "+dias);
		
		
	}

}
