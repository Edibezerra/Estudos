package Controle;

import Utilidades.Data;

public class ContaCorrente extends Conta {

    double taxaMovimentação;

    public ContaCorrente(int nroConta, double saldo, Data dataAbertura, Cliente[] clientes, double taxaMovimentação) {
        super(nroConta, saldo, dataAbertura, clientes);
        this.taxaMovimentação = taxaMovimentação;
    }
    public void fazerDeposito(doublee valor){
        System.out.println("Será cobrado uma taxa de: " + taxaMovimentação);
        super.fazerDeposito(valor - taxaMovimentação);
    }

    public boolean fazerSaque(double valor){
        System.out.println("Será cobrado uma taxa de : " + taxaMovimentação + " " + "caso exista saldo suficiente");
        return super.fazerSaque( valor + taxaMovimentação);
    }

}
