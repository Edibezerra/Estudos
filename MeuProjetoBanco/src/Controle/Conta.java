package Controle;

import java.util.Arrays;

import Utilidades.Data;

public abstract class Conta {

	private int nroConta;
	private double saldo;
	private Data dataAbertura;
	private Cliente[] clientes;

	public Conta(int nroConta, double saldo, Data dataAbertura, Cliente[] clientes) {

		this.nroConta = nroConta;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.clientes = clientes;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Correntista[] getCorrentistas() {
		return correntistas;
	}

	public void setCorrentistas(Correntista[] correntistas) {
		this.correntistas = correntistas;
	}

	@Override
	public String toString() {
		String rpta = "nroConta = " + nroConta + ", saldo = " + saldo + ", "+ dataAbertura + ", "
		+ Arrays.toString(clientes) + "";
		for (int i = 0; i < clientes.length; i++) {
	//		rpta = rpta + clientes[i];
			  		
		}
		return rpta;
	}

	public boolean fazerDeposito(double valor) {

		if (valor >= 0) {
			saldo = saldo + valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean fazerSaque(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean fazerTransferencia(Conta destino, double valor) {
		if (this.fazerSaque(valor) == true) {
			destino.fazerDeposito(valor);
			return true;
		} else {
			return false;
		}

	}
	public final double consultarSaldo() {
		return saldo;
	}

}
