package com.conversor.entidades;

import com.conversor.enumeraciones.Temperaturas;

public class GradoCentigrado extends Temperatura{

	public GradoCentigrado (double cambio) {
		super.temperatura = Temperaturas.CENTRIGRADOS;
		super.cambio = cambio;
	}
}
