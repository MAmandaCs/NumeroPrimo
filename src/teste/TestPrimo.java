package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrimo {

	// verifica se o retorno é primo (true) quando add um número primo.
	@Test
	public void verificaPrimo() {
		Primo primo = new Primo();
		assertEquals(true, primo.verifica(3));
	}
	
	// verifica se o retorno não é primo (false) quando add um número não primo.
	@Test
	public void verificaNaoPrimo(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(9));
	}
	
	// verifica se o retorno é primo (true) quando um número add é negativo e primo.
	@Test
	public void verificaNegativoPrimo(){
		Primo primo = new Primo();
		assertEquals(true, primo.verifica(-3));
	}
	
	// verifica se o retorno  não é primo (false) quando um número add é negativo e não primo.
	@Test
	public void verificaNegativoNaoPrimo(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(-9));
	}
	
	// verifica se o número é 0 (zero).
	@Test
	public void verificaZero(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(0));
	}
	
	// verifica se o número é 1 (um).
	@Test
	public void verificaUm(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(1));
	}
}
