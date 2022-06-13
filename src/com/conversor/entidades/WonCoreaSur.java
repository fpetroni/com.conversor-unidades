package com.conversor.entidades;

import com.conversor.enumeraciones.Divisas;

public class WonCoreaSur extends Moneda{

	public WonCoreaSur(double cambio) {
		super.divisa = Divisas.KRW;
		super.valorDolar = 0.0008;
		super.cambio = cambio;
	}
}
