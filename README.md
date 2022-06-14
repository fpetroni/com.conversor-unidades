<p align="center">
<img src="https://img.shields.io/badge/Estado-EN%20DESARRLLO-green">
<img src="https://img.shields.io/badge/JAVA-11.0v-blue">
<img src="https://img.shields.io/badge/Version-0.2v-yellow">
</p>

# Conversor de Unidades
App de escritorio con Java para conv-ertir unidades (Este programa de escritorio corresponde al 1er Challenge de Alura ONE correspondiente al módulo de JAVA).

Para probarlo en su PC de escritorio o laptop, puede simplemente descargar el archivo <i>com.conversor.jar</i> del proyecto o haciendo <a href="https://github.com/fpetroni/com.conversor-unidades/raw/main/com.conversor.jar">clic aquí</a> simplemente (Me encargué de rutearlo por usted XD). IMPORTANTE: debe tener insta instalado el <b>jdk 11.0</b> o superior.

Puede probarlo sin problemas, pero ante todo recuerde que es un...

<h4 align="center"> 🚧 Proyecto en desarrollo 🚧 </h4>

<hr>

<h2 align="right">Versión 0.2 <i>(Actualización: 13 de Junio de 2022)</i></h2>

<h3>Nuevas Funcionalidades y cambios</h3>
  <p>✔️ Se ha incorporado la conversión de Temperaturas con 3 opciones: <i>Kelvin (K°), Celcius (C°) y Fahrenheit (F°)</i>.</p>
  <p>✔️ Se han corregido algunos títulos de ventana que no mostraban el nombre del programa, como también un texto algunos títulos que indica qué entrada de magnitud se está seleccionando.</p>
  <p>✔️ Se ha incorporado bloques <i>try-catch</i> que detectan si el usuario introduce un valor a convertir que no es un <b>double</b>.</p>

<h3>Implementaciones en Desarrollo</h3>
  <p>🛠️ Conversor de Longitudes y Fuerzas.</p>
  <p>🛠️ Incorporación de un archivo .csv para la actualización de valores de conversión de referencia (Moneda).</p>

<hr>

<h2 align="right">Versión 0.1 <i>(Creación: 12 de Junio de 2022)</i></h2>

<h3>Funcionalidades</h3> 
En estos momentos, el código del programa posee la funcionalidad de convertir un valor entre divisas. Posee 6 divisas cargadas: <i>Dólar Estadounidense(USD), Peso Argentinom(ARS) Euro(EUR), Libra Esterlina(GBP), Yen Japonés(JPY) y Won de Corea del Sur(KRW)</i>
Actualmente funciona por medio de cuadros emergentes que van solicitando que el operador marque opciones hasta arrojar cuadros de textos que brindan información.
La funcionalidad de selector de unidad por medio de un menú desplegable muestra dos opciones: <i>Monedas</i> y <i>Temperaturas</i>, pero la segunda opción no se encuentra configurada, por lo cual cierra el programa.

<h3>Implementaciones en Desarrollo</h3>
<ul>
  <li>Incorporación de conversor de temperaturas y longitudes.</li>
  <li>Incorporación de un archivo .csv para la actualización de valores de conversión de referencia (Moneda).</li>
</ul>

<h3>Errores registrados</h3>
<ul>
  <li>Existe un error regisatrado el cual provoca que aparezca un cuadro de texto "Valor no válido", el cual ocurre al presionar el botón de <b>cerrar ventana</b>. Esto refiere a la implementación a nivel código de las ventanas emergentes y del bloque <try>-<catch> para atrapar el error de selecciones inválidas.</li>
  <li>Aparece un error a corregir referifo a los íconos que deben aparecer en algunas ventanas emergentes, que no condicen con la información o solicitud que acompaña a la misma.</li>
  <li>Se ha detectado que no todas las ventanas emergentes se encuentra el título del programa, el cual es "CONVERSOR DE UNIDADES".</li>
</ul>

<h3>Código en Desarrollo</h3>
<ul>
  <li>Incorporación de una interfaz de selección múltiple de las unidades a convertir (en próximas versiones).</li>
  <li>Implementación de Manejo de Errores}.</li>
  <li>Agrupación de entidades en paquetes individuales para limpiar código interno.</li>
  <li>Mejora de cógido en las clases de Servicios.</li>
</ul>
