/***************************************
 * Autor:                              *
 * -Hernandez Reyes Leticia            *
 * -Villalobos Rodriguez America       *
 *   Yaridsaida                        *
 * -Tineo Tineo Reyder Javier          *
 * -Zavaleta Cruz Jonathan Alexis      *                 
 * Fecha Creación: 12/04/23            *                 
 * Fecha Actualización: 14/04/23       *                 
  * Fecha Actualización: 14/04/23      *                 
 * Descripción: se calcula el volumen  *
 *              la figura esfera 3D    *          
 *                                     *
 **************************************/
package Figura;

public class Esfera extends Figura3D {
  private double radio;

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

@Override
double calcularVolumen() {
	return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
}

  
  
	
}
