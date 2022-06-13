package com.conversor.programa;

import javax.swing.JOptionPane;

import com.conversor.entidades.Moneda;
import com.conversor.entidades.Temperatura;
import com.conversor.servicios.ConvertirServicio;

public class Ventana {

	/**
	 * Ventana de inicio/final que brinda la bienvenida/despedida al programa
	 * 
	 * @param mensaje
	 */
	public static void Iniciar$Finalizar(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "CONVERSOR DE UNIDADES", JOptionPane.DEFAULT_OPTION);
	}

	/**
	 * Ventana que ejecuta el tipo de conversión se desea trabajar
	 * 
	 * NOTA = Se debe incorporar el conversor de Temperatura
	 */
	public static void SelectorUnidad() {
		try {
			String[] unidades = { "Monedas", "Temperaturas" };
			String respuesta = (String) JOptionPane.showInputDialog(null,
					"Seleccione la clase de unidad que desea convertir", "CONVERSOR DE UNIDADES",
					JOptionPane.DEFAULT_OPTION, null, unidades, unidades[0]);
			if (respuesta.equals(unidades[0])) {
				Ventana.convertirMonedas();
			} else if (respuesta.equals(unidades[1])) {
				Ventana.convertirTemperaturas();
			}
		} catch (java.lang.NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Valor no válido", "CONVERSOR DE UNIDADES", JOptionPane.DEFAULT_OPTION);
			if (Ventana.confirmarDialogo("¿Desea continuar con el programa?") != 1) {
				Ventana.SelectorUnidad();
			} else {
				Ventana.Iniciar$Finalizar("Programa Terminado");
				System.exit(0);
			}
		}
	}

	/**
	 * Método en ventanas que ejecuta los procedimientos para la conversión de
	 * MONEDAS.
	 */
	public static void convertirMonedas() {
		ConvertirServicio sc = new ConvertirServicio();
		String[] monedas = { "URS", "ARS", "EUR", "GBP", "JPY", "KRW" };

		try {

			Moneda m1 = sc.seleccion(JOptionPane.showOptionDialog(null, "Seleccione la moneda que desea convertir",
					"CONVERSOR DE UNIDADES - Moneda a Cambiar", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]));

			m1.setCambio(Ventana.valor());

			Moneda m2 = sc.seleccion(JOptionPane.showOptionDialog(null, "Seleccione la moneda que desea convertir",
					"CONVERSOR DE UNIDADES - Moneda de Cambio", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]));

			JOptionPane.showMessageDialog(null, "Conversión realizada\n" + sc.cambiar(m1, m2));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Valor no válido. El valor debe ser un número entero o decimal.\nSe retorna al selector de unidades",
					"CONVERSOR DE UNIDADES - ERROR", JOptionPane.DEFAULT_OPTION);
			Ventana.SelectorUnidad();
		}
	}

	/**
	 * Método en ventanas que ejecuta los procedimientos para la convesión de
	 * TEMPERATURAS.
	 */
	public static void convertirTemperaturas() {
		ConvertirServicio sc = new ConvertirServicio();
		String[] temperaturas = { "K°", "C°", "F°" };

		try {
			Temperatura t1 = sc.seleccion1(JOptionPane.showOptionDialog(null,
					"Seleccione la moneda que desea convertir", "CONVERSOR DE UNIDADES - Temperatura a Cambiar",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]));

			t1.setCambio(Ventana.valor());

			Temperatura t2 = sc.seleccion1(JOptionPane.showOptionDialog(null,
					"Seleccione la moneda que desea convertir", "CONVERSOR DE UNIDADES - Temperatura de Cambio",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]));

			JOptionPane.showMessageDialog(null, "Conversión realizada\n" + sc.cambiar(t1, t2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Valor no válido. El valor debe ser un número entero o decimal.\nSe retorna al selector de unidades",
					"CONVERSOR DE UNIDADES", JOptionPane.DEFAULT_OPTION);
			Ventana.SelectorUnidad();
		}

	}

	/**
	 * Ventana para ejecutar una solicitud de confirmación.
	 * 
	 * @param mensaje
	 * @return
	 */
	public static int confirmarDialogo(String mensaje) {
		return JOptionPane.showConfirmDialog(null, mensaje);
	}

	/**
	 * Método que ejecuta la ventana que retorna el valor (double) de una unidad
	 * seleccionada.-
	 * 
	 * El método ejecuta el try-catch en bucle hasta que el usuario coloca bien el
	 * valor, inclusive si coloca cancelar dentro de la misma ventana. Dicho catch
	 * debe ser corregido en una futura versión del programa.
	 * 
	 * @return valor
	 */
	public static double valor() {
		return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor", "ingrese valor aquí"));
	}
}
