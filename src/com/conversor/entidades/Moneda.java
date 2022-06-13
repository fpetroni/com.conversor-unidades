package com.conversor.entidades;
import com.conversor.enumeraciones.Divisas;

public class Moneda extends Unidad {
	protected double valorDolar;
	protected Divisas divisa;
	
	public Divisas getDivisa() {
		return divisa;
	}

	public double getValorDolar() {
		return valorDolar;
	}

}
