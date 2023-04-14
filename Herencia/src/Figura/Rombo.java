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
 *              de un rombo 2D         *
 **************************************/
package Figura;

public class Rombo extends Figura2D {
 private double d1;
 private double d2;
 private double lado;

public void setLado(double lado) {
	this.lado = lado;
}

public double getD1() {
	return d1;
}
public void setD1(double d1) {
	this.d1 = d1;
}
public double getD2() {
	return d2;
}
public void setD2(double d2) {
	this.d2 = d2;
}
 
@Override
double calcularArea() {
	return (d1 * d2) / 2;
}

@Override
double calcularPerimetro() {
	return Math.pow(4,lado);
}
}
