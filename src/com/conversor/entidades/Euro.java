package com.conversor.entidades;

import com.conversor.enumeraciones.Divisas;

public class Euro extends Moneda{

	public Euro(double cambio) {
		super.divisa = Divisas.EUR;
		super.valorDolar = 1.0520;
		super.cambio = cambio;
	}
	
}
