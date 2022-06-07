package com.udc.service;

public class Frete {
	
	private TipoFrete tipo;
	
	public Frete(TipoFrete tipo) {
		this.tipo = tipo;
	}
	
	public double calcularPreco(int distancia) {
		double preco = 0;
		if(TipoFrete.NORMAL.equals(tipo)) {
			preco = distancia * 1.25 + 1;
		}else if (TipoFrete.SEDEX.equals(tipo)) {
			preco = distancia * 1.45 + 3;
		}else if (TipoFrete.JADLOG.equals(tipo)) {
			preco = distancia * 1.30 + 2;
		}else if (TipoFrete.FEDEX.equals(tipo)) {
			preco = distancia * 1.35;
		}else if (TipoFrete.SPRINT.equals(tipo)) {
			preco = distancia * 1.32;
		}
		return preco;

	}
}
