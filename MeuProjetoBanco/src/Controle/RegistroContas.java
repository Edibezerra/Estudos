package Controle;

import Utilidades.Data;

public class RegistroContas {

	public static void main(String[] args) {
		
		Data d = new Data(31,9,2024);
		Cliente c1 = new Cliente("02369787481", "Edinardo");
		Cliente c2 = new Cliente("02369787422", "Pérola");

		Cliente [] clientes = new Cliente[2];
		clientes [0] = c1;
		clientes [1] = c2;
		
		Conta conta1 = new Conta(21, 200, d , clientes);
		System.out.println(conta1);
		conta1.fazerDeposito(300);
		
		System.out.println(conta1);
		
	}
	

}
