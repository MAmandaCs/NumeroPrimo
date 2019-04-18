package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrimo {

	// verifica se o retorno � primo (true) quando add um n�mero primo.
	@Test
	public void verificaPrimo() {
		Primo primo = new Primo();
		assertEquals(true, primo.verifica(3));
	}
	
	// verifica se o retorno n�o � primo (false) quando add um n�mero n�o primo.
	@Test
	public void verificaNaoPrimo(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(9));
	}
	
	// verifica se o retorno � primo (true) quando um n�mero add � negativo e primo.
	@Test
	public void verificaNegativoPrimo(){
		Primo primo = new Primo();
		assertEquals(true, primo.verifica(-3));
	}
	
	// verifica se o retorno  n�o � primo (false) quando um n�mero add � negativo e n�o primo.
	@Test
	public void verificaNegativoNaoPrimo(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(-9));
	}
	
	// verifica se o n�mero � 0 (zero).
	@Test
	public void verificaZero(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(0));
	}
	
	// verifica se o n�mero � 1 (um).
	@Test
	public void verificaUm(){
		Primo primo = new Primo();
		assertEquals(false, primo.verifica(1));
	}
}
