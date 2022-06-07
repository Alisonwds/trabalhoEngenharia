package com.udc.entregador;

import com.udc.service.Frete;

public class Sedex implements Frete {
	public double calcularPreco(int distancia) {
		return distancia * 1.35 + 1;

	}


}
