package com.conversor.servicios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import com.conversor.entidades.*;
import com.conversor.enumeraciones.Temperaturas;

public class ConvertirServicio {
	private DecimalFormat df = new DecimalFormat("###.##"); // Atributo para formatear los valores decimales

	/**
	 * Método que retorna la moneda de selección por parte del usuario.
	 * 
	 * NOTA: Se debe mejorar la instrucción del "catch" del bloque de errores.
	 * 
	 * @param seleccion
	 * @return nuevo tipo de moneda
	 */
	public Moneda seleccion(int seleccion) {
		try {
			switch (seleccion) {
			case 0:
				return new DolarEstadounidense(1.0);
			case 1:
				return new PesoArgentino(1.0);
			case 2:
				return new Euro(1.0);
			case 3:
				return new LibraEsterlina(1.0);
			case 4:
				return new Yen(1.0);
			case 5:
				return new WonCoreaSur(1.0);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha detectado un error inesperado.\nEl programa se cerrará",
					"CONVERSOR DE UNIDADES", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return null;
	}

	/**
	 * Método que retorna la la unidad de temperatura solicitada por el ususario.
	 * 
	 * NOTA: Se debe mejorar la instrucción del "catch" del bloque de errores.
	 * 
	 * @param seleccion
	 * @return
	 */
	public Temperatura seleccion1(int seleccion) {
		try {
			switch (seleccion) {
			case 0:
				return new Kelvin(1.0);
			case 1:
				return new GradoCentigrado(1.0);
			case 2:
				return new Fahrenheit(1.0);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha detectado un error inesperado.\nEl programa se cerrará",
					"CONVERSOR DE UNIDADES", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return null;
	}

	/**
	 * Método que realiza la operación de cambio sobre el valor ingresado y las
	 * monedas seleccionadas
	 * 
	 * NOTA: Se debe mejorar la instrucción del "catch" del bloque de errores.
	 * 
	 * @param m1
	 * @param m2
	 */
	public String cambiar(Moneda m1, Moneda m2) {
		try {
			double operacionCambio = m1.getCambio() / m2.getValorDolar() * m1.getValorDolar();
			return m1.getDivisa() + " " + df.format(m1.getCambio()) + " = " + m2.getDivisa() + " "
					+ df.format(operacionCambio);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha detectado un error inesperado.\nEl programa se cerrará",
					"CONVERSOR DE UNIDADES", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return null;
	}

	/**
	 * Método que realiza la operación de cambio sobre el valor ingresado y las
	 * temperaturas seleccionadas
	 * 
	 * NOTA: Se debe mejorar la instrucción del "catch" del bloque de errores.
	 * 
	 * @param t1
	 * @param t2
	 */
	public String cambiar(Temperatura t1, Temperatura t2) {
		try {
			double oc = 0.0;
			if (t1.getTemperatura() == Temperaturas.CENTRIGRADOS && t2.getTemperatura() == Temperaturas.KELVIN) {
				oc = t1.getCambio() + 273.15;
			} else if (t1.getTemperatura() == Temperaturas.CENTRIGRADOS && t2.getTemperatura() == Temperaturas.FAHRENHEIT) {
				oc =  (t1.getCambio() * (9.0/5.0)) + 32.0;
			} else if (t1.getTemperatura() == Temperaturas.FAHRENHEIT && t2.getTemperatura() == Temperaturas.KELVIN) {
				oc = ((t1.getCambio() - 32.0) * (5.0/9.0)) + 273.15;
			} else if (t1.getTemperatura() == Temperaturas.FAHRENHEIT && t2.getTemperatura() == Temperaturas.CENTRIGRADOS) {
				oc = ((t1.getCambio() - 32.0) * (5.0/9.0));
			} else if (t1.getTemperatura() == Temperaturas.KELVIN && t2.getTemperatura() == Temperaturas.CENTRIGRADOS) {
				oc = t1.getCambio() - 273.15;
			} else if (t1.getTemperatura() == Temperaturas.KELVIN && t2.getTemperatura() == Temperaturas.FAHRENHEIT) {
				oc = ((t1.getCambio() - 273.15) * (9.0/5.0)) + 32.0;
			} else if (t1.getTemperatura() == t2.getTemperatura()) {
				oc = t1.getCambio();
			}
			return t1.getTemperatura() + " " + df.format(t1.getCambio()) + " = " + t2.getTemperatura() + " "
					+ df.format(oc);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha detectado un error inesperado.\nEl programa se cerrará",
					"CONVERSOR DE UNIDADES", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return null;
	}
}