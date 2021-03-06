package ar.edu.unlam;
/*Cuenta Corriente
La m�s compleja de las cuentas, �sta permite establecer una cantidad de dinero a girar en descubierto. 
Es por ello que cada vez que se desee extraer dinero, no s�lo se considera el que se posee, 
sino el l�mite adicional que el banco estar� brindando. Por supuesto esto no es gratis, ya que el banco
 nos cobrar� un 5% como comisi�n sobre todo el monto en descubierto consumido en la operaci�n. 
 Por ejemplo, si tuvi�ramos $ 100 en la cuenta, y quisi�ramos retirar $ 200 (con un descubierto de $ 150),
  podremos hacerlo. Pasaremos a deberle al banco $ 105 en total: los $ 100 que nos cubri�,
   m�s el 5% adicional sobre el descubierto otorgado.*/

public class CuentaCorriente extends CuentaSueldo {
	private double girarDescubierto;
	private  double comisionBanco;
	private double deudaConBanco;
	
	public CuentaCorriente (double total,double cantidadExtraParaGirar)
	{
		super(total);
		this.girarDescubierto=cantidadExtraParaGirar;
		this.comisionBanco= (float)0.05;
	
	}
	
	public float getPorcentaje()
	{
		comisionBanco= (float)total*comisionBanco;
		return cominsionBanco;
	}
	public double getGirarDescubierto(double dineroRetirar)
	{
		if(dineroRetirar>total)
		{
			dineroRetirar=dineroRetirar-total;
			
			if(girarDescubierto>dineroRetirar)
			{
				return dineroRetirar*comisionBanco;
				
			}
			
		}
		
	}
	
	
	
	
}
