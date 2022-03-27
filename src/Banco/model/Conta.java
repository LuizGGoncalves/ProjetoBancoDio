package Banco.model;

import Banco.model.interfaces.ContaInterface;

public abstract class Conta implements ContaInterface {
    protected double saldo;
    protected int agencia;
    protected int numero;

    public Conta(int numero) {
        this.saldo = 0;
        this.agencia = 1;
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
