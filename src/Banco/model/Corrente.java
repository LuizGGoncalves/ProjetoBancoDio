package Banco.model;

import Banco.model.Conta;

public class Corrente extends Conta {

    public Corrente(int numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado " + valor + "Saldo em conta --> " + this.saldo);
    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Sacado " + valor + "Saldo em conta --> " + this.saldo);
    }
    @Override
    public void extrato() {
        System.out.println("Seu saldo é de --> " + this.saldo);
    }
}
