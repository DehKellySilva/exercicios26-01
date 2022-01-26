package exercicioJava;

import java.util.Scanner;

public class duracaoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas,minutos,segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a duração do evento da fábrica em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.println("\nA duração do evento é de: "+horas+" horas, "+minutos+" minutos, "+segundos+" segundos");
		
	
	}

}
