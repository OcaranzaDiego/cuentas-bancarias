package edu.tallerweb.cuentas;

public class CajaAhorros extends AbstractCuenta{
	int cantidad = 0;
public void depositar(final Double monto) {
	super.depositar(monto);
		}

public void extraer(final Double monto){ 
	super.extraer(monto);
	cantidad++;
	if ( cantidad > 5){
	super.extraer(6.0); 
	}
	}

public Double getSaldo() {
	return super.getSaldo();
	}

}
