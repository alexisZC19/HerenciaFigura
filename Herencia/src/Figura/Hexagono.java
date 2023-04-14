package Figura;

/***************************************
 * Autor:                              *
 * -Hernandez Reyes Leticia            *
 * -Villalobos Rodriguez America       *
 *   Yaridsaida                        *
 * -Tineo Tineo Reyder Javier          *
 * -Zavaleta Cruz Jonathan Alexis      *                 
 * Fecha Creación: 12/04/23            *                 
 * Fecha Actualización: 14/04/23       *                 
 * Descripción: se calcula el área,    *
 *              perímetro y apotema de *
 *              la figura  hexagono 2D *          
 *                                     *
 **************************************/

public class Hexagono extends Poligonos {

	private double lado;
	private double perimetro = 6 * lado;
	private double apotema = lado * Math.sqrt(3) / 2;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
		this.perimetro = 6 * lado;
		this.apotema = lado * Math.sqrt(3) / 2;
	}

	@Override
	double calcularArea() {
		return perimetro * apotema / 2;
	}

	@Override
	double calcularPerimetro() {
		return perimetro;
	}

	@Override
	double calcularApotema() {
		return apotema;
	}
}
