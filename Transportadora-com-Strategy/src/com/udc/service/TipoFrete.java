package com.udc.service;

import com.udc.entregador.Fedex;
import com.udc.entregador.Jadlog;
import com.udc.entregador.Normal;
import com.udc.entregador.Sedex;
import com.udc.entregador.Sprint;

public enum TipoFrete {
	
	NORMAL {
		@Override
		public Frete obterFrete() {
			
			return new Normal();
		}
	}, SEDEX {
		@Override
		public Frete obterFrete() {
			
			return new Sedex();
		}
	}, JADLOG {
		@Override
		public Frete obterFrete() {
			
			return new Jadlog();
		}
	}, FEDEX {
		@Override
		public Frete obterFrete() {
			
			return new Fedex();
		}
	}, SPRINT {
		@Override
		public Frete obterFrete() {
			
			return new Sprint();
		}
	};
	
	public abstract Frete obterFrete();

}
