package com.conversor.entidades;

import com.conversor.enumeraciones.Temperaturas;

public class Kelvin extends Temperatura {
	
	public Kelvin (double cambio) {
		super.temperatura = Temperaturas.KELVIN;
		super.cambio = cambio;
	}
}
