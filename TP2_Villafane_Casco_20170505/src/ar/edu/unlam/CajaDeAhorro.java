package ar.edu.unlam;
/*Caja de Ahorros
	Similar a la anterior, pero se pide que luego de la quinta
 	extracción de dinero se cobre un costo adicional por extracción de $ 6
 	
 	*/

public class CajaDeAhorro extends CuentaSueldo {
	private double adicional;
	private Integer limiteExtracciones;
	
	
	public CajaDeAhorro (double total)
	{
		super(total);
		this.adicional=6;
		this.limiteExtracciones=5;
	}
	
	public double cantidadExtracciones(Integer extraccionesRealizadas)	
	{
		if(extraccionesRealizadas>limiteExtracciones)
		{
			double total + adicional;
			return  total;
			
		}
	}
}
