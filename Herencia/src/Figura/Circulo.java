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
 *              de un círculo  2D      *
 **************************************/
package Figura;

public class Circulo extends Figura2D {
 private double radio;

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}
 
@Override
double calcularArea() {
	return  Math.PI * Math.pow(radio, 2);
}

@Override
double calcularPerimetro() {
	return 2 * Math.PI * radio;
}


}
