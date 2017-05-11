package edu.ar.unlam.basica2.clases;

public class CuentaDeAhorros extends Cuenta{
	
	private static final double A_EXTRAER_EXCESO = 6.0;
	private static final int CANTIDAD_MAXIMA_EXTRACCIONES = 5;
	
	private Integer cantidadExtracciones;
	
	public CuentaDeAhorros(Double saldo) {
		super(saldo);
		this.cantidadExtracciones = 0;
	}
	
	public CuentaDeAhorros() {
		super();
	}

	@Override
	public Boolean extraer(Double aExtraer){
		
		if(super.extraer(aExtraer)){
			cantidadExtracciones++;
			
			if(cantidadExtracciones > CANTIDAD_MAXIMA_EXTRACCIONES){
				super.setSaldo(super.getSaldo() - A_EXTRAER_EXCESO);
			}
			return true;
		}
		
		return false;
	}

}
