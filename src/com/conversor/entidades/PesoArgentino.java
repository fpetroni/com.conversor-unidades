package com.conversor.entidades;

import com.conversor.enumeraciones.Divisas;

public class PesoArgentino extends Moneda{
	
	public PesoArgentino(double cambio) {
		super.divisa = Divisas.ARS;
		super.valorDolar = 0.0082;
		super.cambio = cambio;
	}
	
}
