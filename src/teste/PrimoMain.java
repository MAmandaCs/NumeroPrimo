package teste;

import java.util.Scanner;

public class PrimoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se ele � primo");
		int num = in.nextInt();
		
		Primo primo = new Primo();
		
		System.out.println(primo.verifica(num));
	}

}
