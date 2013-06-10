package edu.tallerweb.cuentas;

public abstract class AbstractCuenta {
private double efectivo = 0.0;
	
public void depositar(final Double monto){
	if ( monto >= 0 ) {
		this.efectivo = this.efectivo + monto; 
		}
	else throw new CuentaBancariaException("El monto debe ser positivo"); 
		}

public void extraer(final Double monto){
                 if ( monto > 0 ){
                          if( this.efectivo >= monto) {
                                   this.efectivo -= monto; }
                          else throw new CuentaBancariaException("El satdo es Insuficiente");
                 }
                 else { throw new CuentaBancariaException("Error en el monto, el mismo no puede ser negativo"); }
         }

public Double getSaldo(){
	return this.efectivo;}
	
public void setSaldo(final Double monto){
	this.efectivo = monto; }
}
