package edu.tallerweb.cuentas;

public class CajaAhorros extends AbstractCuenta{

public void depositar(final Double monto) {
	super.depositar(monto);
		}

public void extraer(final Double monto){ 
	int cantidadExtracciones = 0;
	super.extraer(monto);
	cantidadExtracciones++;
	if ( cantidadExtracciones > 5){
	super.extraer(6.0); 
	}
	}

public Double getSaldo() {
	throw new RuntimeException("No implementado aÃºn");
	}

}
