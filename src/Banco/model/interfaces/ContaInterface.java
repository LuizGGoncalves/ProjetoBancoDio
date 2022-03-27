package Banco.model.interfaces;

import Banco.model.Conta;

public interface ContaInterface {
     void depositar(double valor);
     void sacar(double valor);
     void extrato();
}
