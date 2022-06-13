package com.conversor.entidades;

import com.conversor.enumeraciones.Divisas;

public class Yen extends Moneda{
	
	public Yen(double cambio) {
		super.divisa = Divisas.JPY;
		super.valorDolar = 0.0074;
		super.cambio = cambio;
	}
}
