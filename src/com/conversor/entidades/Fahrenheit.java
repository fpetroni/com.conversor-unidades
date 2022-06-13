package com.conversor.entidades;

import com.conversor.enumeraciones.Temperaturas;

public class Fahrenheit extends Temperatura{

	public Fahrenheit (double cambio) {
		super.temperatura = Temperaturas.FAHRENHEIT;
		super.cambio = cambio;
	}
	
}
