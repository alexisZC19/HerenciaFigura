/***************************************
 * Autor:                              *
 * -Hernandez Reyes Leticia            *
 * -Villalobos Rodriguez America       *
 *   Yaridsaida                        *
 * -Tineo Tineo Reyder Javier          *
 * -Zavaleta Cruz Jonathan Alexis      *                 
 * Fecha Creación: 12/04/23            *                 
 * Fecha Actualización: 14/04/23       *                 
 * Descripción: se calcula el volumen  *
 *                  la figura cubo 3D  *          
 *                                     *
 **************************************/
package Figura;

public class Cubo extends Figura3D{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double calcularVolumen() {
		return  Math.pow(lado, 3);
	}

	
	
	
	

}
