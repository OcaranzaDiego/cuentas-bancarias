package edu.tallerweb.cuentas;

public class CuentaCorriente extends AbstractCuenta {

private double descubiertoTotal;
private double descubiertoInicial;
public CuentaCorriente(final Double descubiertoTotal) {
this.descubiertoTotal = descubiertoTotal;
this.descubiertoInicial = descubiertoTotal;
}
	
public void depositar(final Double monto) {
	if(this.descubiertoTotal < this.descubiertoInicial) {
		if( this.descubiertoInicial - this.descubiertoTotal < monto){
			this.descubiertoTotal = this.descubiertoInicial;
			super.depositar(monto - (this.descubiertoInicial - this.descubiertoTotal));
		} else {this.descubiertoTotal -= monto; }
	} else { super.depositar(monto); }
	
}

public void extraer(final Double monto) {
	if( monto > this.getSaldo() ) {
	if ( monto <= this.descubiertoTotal ){
	this.descubiertoTotal -= monto;
	super.setSaldo(0.0);
	}
	else throw new CuentaBancariaException("No cubre descubierto");
	}
	else { super.extraer(monto); }
	}

public Double getSaldo() {
	return super.getSaldo();
}
	
public Double getDescubierto() {
	return this.descubiertoTotal;
	}

}
