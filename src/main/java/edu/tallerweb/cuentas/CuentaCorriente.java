package edu.tallerweb.cuentas;

public class CuentaCorriente extends AbstractCuenta {

private double descubiertoTotal = 150;
public CuentaCorriente(final Double descubiertoTotal) {
	throw new RuntimeException("No implementado aÃºn");
}
	
public void depositar(final Double monto) {
	throw new RuntimeException("No implementado aÃºn");
}

public void extraer(final Double monto) {
	if( monto > this.getSaldo() ) {
	Double montoConImpuesto = ( monto - this.getSaldo() ) * 1.05 ;
	if ( montoConImpuesto <= this.descubierto ){
	this.descubierto -= montoConImpuesto;
	super.saldo = 0.0;
	}
	else throw new CuentaBancariaException("No cubre descubierto");
	}
	else { super.extraer(monto); }
	}

public Double getSaldo() {
	throw new RuntimeException("No implementado aÃºn");
}
	
public Double getDescubierto() {
	throw new RuntimeException("No implementado aÃºn");
	}

}
