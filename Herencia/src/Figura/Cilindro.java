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
 *            la figura cilindro 3D    *          
 *                                     *
 **************************************/
package Figura;

public class Cilindro extends Figura3D {
	private double radio;
	private double altura;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	double calcularVolumen() {
		return Math.PI * Math.pow(radio, 2) * altura;
	}
	
	
	
	

}
