package edu.ar.unlam.basica2.test;

import org.junit.Assert;
import org.junit.Test;

import edu.ar.unlam.basica2.clases.CuentaCorriente;
import edu.ar.unlam.basica2.clases.CuentaDeAhorros;
import edu.ar.unlam.basica2.clases.CuentaSueldo;

public class CuentaTest {

	@Test
	public void testCuentaCorrienteDepositar() {
		//Preparacion
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		Double valorEsperado = (double) 4000;
		//Ejecucion
		cuentaCorriente.setSaldo((double) 4000);
		Double valorActual = cuentaCorriente.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testCuentaDeAhorrosDepositar() {
		//Preparacion
		CuentaDeAhorros cuentaDeAhorros = new CuentaDeAhorros();
		Double valorEsperado = (double) 4000;
		//Ejecucion
		cuentaDeAhorros.setSaldo((double) 4000);
		Double valorActual = cuentaDeAhorros.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	/*
	CuentaSueldo cuenta = new CuentaSueldo();

	cuenta.depositar(4000.0);*/
	
	/*Double saldo = cuenta.getSaldo();

	// saldo debe valer 4000.0*/
	
	@Test
	public void testCuentaSueldoDepositar() {
		//Preparacion
		CuentaSueldo cuentaSueldo = new CuentaSueldo();
		Double valorEsperado = (double) 4000;
		//Ejecucion
		cuentaSueldo.setSaldo((double) 4000);
		Double valorActual = cuentaSueldo.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	/*cuenta.extraer(500.0);

	saldo = cuenta.getSaldo();

	// saldo debe valer 3500.0*/
	
	@Test
	public void testCuentaSueldoExtraerOK() {
		//Preparacion
		CuentaSueldo cuentaSueldo = new CuentaSueldo((double) 4000);
		Double valorEsperado = (double) 3500;
		//Ejecucion
		cuentaSueldo.extraer((double) 500);
		Double valorActual = cuentaSueldo.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}

	/*cuenta.extraer(4000.0);

	// la operación no debe poder realizarse

	// y debe lanzar una excepción (RuntimeException) – tema a desarrollar 12Jun17*/
	
	@Test
	public void testCuentaSueldoExtraer() {
		//Preparacion
		CuentaSueldo cuentaSueldo = new CuentaSueldo((double) 4000);
		Double valorEsperado = (double) 4000;
		//Ejecucion
		cuentaSueldo.extraer((double) 4100);
		Double valorActual = cuentaSueldo.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testCuentaAhorroExtraer() {
		//Preparacion
		CuentaDeAhorros cuentaAhorro = new CuentaDeAhorros((double) 4000);
		Double valorEsperado = (double) 3394;
		//Ejecucion
		cuentaAhorro.extraer((double) 100);
		cuentaAhorro.extraer((double) 100);
		cuentaAhorro.extraer((double) 100);
		cuentaAhorro.extraer((double) 100);
		cuentaAhorro.extraer((double) 100);
		cuentaAhorro.extraer((double) 100);
		Double valorActual = cuentaAhorro.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testCuentaCorrienteExtraer() {
		//Preparacion
		CuentaCorriente cuentaCorriente = new CuentaCorriente((double) 4000,(double) 150);
		Double valorEsperado = (double) -105;
		//Ejecucion
		cuentaCorriente.extraer((double) 4100);
		Double valorActual = cuentaCorriente.getSaldo();
		//Comprobacion
		Assert.assertEquals(valorEsperado, valorActual);
	}

}
