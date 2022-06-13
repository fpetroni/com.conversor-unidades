package com.conversor.programa;

public class Programa {

	public static void main(String[] args) {
		
		Ventana.Iniciar$Finalizar("Bienvenido al programa de Conversión de Unidades");
		do {
			Ventana.SelectorUnidad();
		} while(Ventana.confirmarDialogo("Desea continuar con el programa?") != 1);
		Ventana.Iniciar$Finalizar("Programa Terminado");
	}
}
