package ar.edu.unlam;
/*Cuenta Sueldo
 * Nosotros vamos a ser menos estrictos, ya que por el momento no nos interesa computar los movimientos de dinero del cliente sino los totales instant�neos 
 * (es decir, cu�nto dinero tiene el cliente a cada momento luego de realizar cada transacci�n).
Es el tipo de cuenta m�s simple, ya que se rige por la premisa de que en tanto y en cuanto se tenga 
tanto o m�s dinero en cuenta del que se quiere extraer, la operaci�n se debe efectuar correctamente.*/
public class CuentaSueldo {
	
	private double cuenta;
	private boolean estado;
	
	public CuentaSueldo(double total) {
		
	}

	public  void cuentaSueldo(double total)
	{
			this.cuenta = total;
			this.estado=false;
	}

	public boolean getPosibleExtraer(double retiroDinero)
	{
		
		if(retiroDinero<= cuenta)
		{
			estado=true;
			return estado;
			
		}
		else
		{
			return estado;
		}
		
	}
	
	
	
}
