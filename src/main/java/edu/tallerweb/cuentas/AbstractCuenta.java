package edu.tallerweb.cuentas;

public abstract class AbstractCuenta {
private double efectivo = 0.0;
protected saldo;
	
public void depositar(final Double monto){
	if ( monto >= 0 ) {
		this.efectivo = this.efectivo + monto; 
		}
	else throw new CuentaBancariaException("El monto debe ser positivo"); 
		}

public void extraer(final Double monto){
	if (monto < this.saldo && monto > 0) {
		this.saldo = this.saldo - monto;}
	else { throw new CuentaBancariaException("Error");
		}

public Double getSaldo(){
	return this.saldo;}
	}
