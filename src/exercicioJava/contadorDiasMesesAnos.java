package exercicioJava;

import java.util.Scanner;

public class contadorDiasMesesAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias,meses=0,anos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite o(s) dia(s): ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) / 12;
		
		System.out.println("Você tem: "+anos+" ano(s), "+meses+ " mes(es), "+dias+ " dias. ");
	}

}
