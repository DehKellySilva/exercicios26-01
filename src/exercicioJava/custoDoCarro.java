package exercicioJava;

import java.util.Scanner;

public class custoDoCarro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float porcentagemDistribuidor = 28;
		float custoFabrica,valorDistribuidor,valorImpostos,custoConsumidor;
		
		Scanner leia = new Scanner(System.in);

		
		System.out.println("\nInforme o valor de custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		valorDistribuidor = custoFabrica + (custoFabrica * porcentagemDistribuidor / 100);
		valorImpostos = custoFabrica + (custoFabrica * porcentagemDistribuidor / 100);
		custoConsumidor = custoFabrica + valorDistribuidor + valorImpostos;
		
		System.out.println("\nO custo do consumidor de um carro novo é: " +custoConsumidor);


	}

}
