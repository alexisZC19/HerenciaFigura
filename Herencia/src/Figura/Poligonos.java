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
 *              perímetro, apotema de  *
                la figura polígono 2D  *          
 *                                     *
 **************************************/
package Figura;

public class Poligonos extends Figura2D {
	private String numLados;
	private String apotema;

	public String getNumLados() {
		return numLados;
	}

	public void setNumLados(String numLados) {
		this.numLados = numLados;
	}

	public String getApotema() {
		return apotema;
	}

	public void setApotema(String apotema) {
		this.apotema = apotema;
	}

	@Override
	double calcularArea() {
		return 0;
	}

	@Override
	double calcularPerimetro() {
		return 0;
	}

	double calcularApotema() {
		return 0;
	}

}
