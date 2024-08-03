package Controle;

import Utilidades.Data;

public class RegistroContas {

	public static void main(String[] args) {
		Data d = new Data(31,07,2024);
		Correntista c1 = new Correntista("02369787481", "Edinardo");
		Correntista c2 = new Correntista("02369787422", "Pérola");
		Correntista [] correntistas = new Correntista[2];
		correntistas [0] = c1;
		correntistas [1] = c2;
		
		Conta conta1 = new Conta(21, 200, d ,correntistas);
		conta1.fazerDeposito(300);
		conta1.fazerDeposito(300);
		conta1.fazerDeposito(300);
		conta1.fazerSaque(1100);
		
		System.out.println(conta1);
		
	}
	

}
