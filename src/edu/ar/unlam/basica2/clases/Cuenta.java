package edu.ar.unlam.basica2.clases;

public class Cuenta {
	
	private String nroCuenta;
	private Double saldo;
	
	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public Cuenta() {
		super();
	}

	public void depositar(Double aDepositar){
		this.setSaldo(this.getSaldo() + aDepositar);
	}
	
	public Boolean extraer(Double aExtraer){
		if(this.getSaldo() > aExtraer){
			this.setSaldo(this.getSaldo() - aExtraer);
			return true;
		}
		return false;
	}
	
	public String getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
