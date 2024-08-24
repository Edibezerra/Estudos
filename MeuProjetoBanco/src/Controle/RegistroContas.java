package Controle;

import Utilidades.Data;

public class RegistroContas {

	public static void main(String[] args) {
		
		Data d = new Data(31,9,2024);
		Data d1 = new Data(02,12,2050);
		Cliente c1 = new Cliente("02369787488", "Edinardo");
		Cliente c2 = new Cliente("02369787422", "Pérola");

		Cliente c3 = new Cliente("03425487481", "Lucimar");

		Cliente [] clientes = new Cliente[2];
		clientes [0] = c1;
		clientes [1] = c2;

		Cliente [] clientes2 = new Cliente[1];
		clientes2 [0] = c3;

		
		Conta conta = new ContaCorrente(21, 200, d,clientes, 0.15);
		Conta conta1 = new ContaPoupanca(50, 1000, d1,clientes2);


		conta.fazerDeposito(300);
		System.out.println(conta);
		if (conta.fazerSaque(400)== true) {
			System.out.println("Saque realizado com sucesso");						
		} else {
			System.out.println("Saldo insufuciente");			
		}		
		System.out.println(conta);
		
		conta1.fazerDeposito(500);
		System.out.println(conta1);		
	
	}	

}
