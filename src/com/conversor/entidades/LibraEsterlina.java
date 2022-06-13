package com.conversor.entidades;

import com.conversor.enumeraciones.Divisas;

public class LibraEsterlina extends Moneda{

	public LibraEsterlina(double cambio) {
		super.divisa = Divisas.GBP;
		super.valorDolar = 1.2316;
		super.cambio = cambio;
	}
	
}
