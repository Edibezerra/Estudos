package Controle;

import Utilidades.Data;

public class ContaCorrente extends Conta {

    double taxaMovimentação;

    public ContaCorrente(int nroConta, double saldo, Data dataAbertura, Cliente[] clientes, double taxaMovimentação) {
        super(nroConta, saldo, dataAbertura, clientes);
        this.taxaMovimentação = taxaMovimentação;
    }

}
