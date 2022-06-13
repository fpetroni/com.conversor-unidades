package com.conversor.entidades;

import com.conversor.enumeraciones.Divisas;

public class DolarEstadounidense extends Moneda {
	
	public DolarEstadounidense(double cambio) {
		super.divisa = Divisas.USD;
		super.valorDolar = 1.0;
		super.cambio = cambio;
	}

}