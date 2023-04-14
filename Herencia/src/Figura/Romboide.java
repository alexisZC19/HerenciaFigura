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
 *              de un romboide 2D      *
 **************************************/
 
package Figura;

public class Romboide extends Poligonos {
	private double altura;
	private double base;
	private double lado;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	double calcularArea() {
		return base * altura;
	}
	@Override
	double calcularPerimetro() {
	return  2 * (base + lado);	
	}

	

}
