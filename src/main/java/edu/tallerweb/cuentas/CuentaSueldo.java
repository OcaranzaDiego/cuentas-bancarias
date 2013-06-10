package edu.tallerweb.cuentas;

public class CuentaSueldo extends AbstractCuenta {

public void depositar(final Double monto) {
	super.depositar(monto);
	}

public void extraer(final Double monto) {
	super.extraer(monto);
	}

public Double getSaldo() {
	return super.getSaldo();
	}
}

