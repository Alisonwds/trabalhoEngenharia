package com.udc.transportadora;

import java.util.Scanner;

import com.udc.service.Frete;
import com.udc.service.TipoFrete;

public class Main {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			System.out.print("Informe a distancia: ");
			int distancia = entrada.nextInt();
			System.out.print("Qual o tipo de frete (1) NORMAL (2) SEDEX (3) JADLOG (4)FEDEX (5)SPRINT: ");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
			
			Frete frete = new Frete(tipoFrete);
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de R$%.2f", preco);
		}

	}

}
