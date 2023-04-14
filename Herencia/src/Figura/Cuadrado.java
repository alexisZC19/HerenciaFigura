 /***************************************
 * Autor:                              *
 * -Hernandez Reyes Leticia            *
 * -Villalobos Rodriguez America       *
 *   Yaridsaida                        *
 * -Tineo Tineo Reyder Javier          *
 * -Zavaleta Cruz Jonathan Alexis      *                 
 * Fecha Creación: 12/04/23            *                 
 * Fecha Actualización: 14/04/23       *                 
 * Descripción: se calcula el área y   *
 *              perímetro de la figura *          
 *              de un cuadrado 2D      *
 **************************************/

package Figura;

public class Cuadrado extends Poligonos {
private double lado;

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
double calcularArea() {
	return  lado * lado;
}

@Override
double calcularPerimetro() {
	return 4 * lado;
}
	
}
