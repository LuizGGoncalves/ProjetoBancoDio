package Banco;

import Banco.model.Banco;
import Banco.model.Cliente;
import Banco.model.Corrente;
import Banco.model.Poupanca;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco("BP");
        Cliente cliente = banco.mostraMenu();
        System.out.println("Seja Bem vindo" + cliente.getNome());
        if(cliente.getCc() != null ){
            while(true) {
                System.out.println("Voce possui uma conta Corrente em aberto");
                Corrente conta = cliente.getCc();
                conta.extrato();
                System.out.println("------------------------------------------");
                System.out.println("[1] - Depositar");
                System.out.println("[2] - Sacar");
                System.out.println("[3] - extrato");
                System.out.println("[5] - exit");
                System.out.println("------------------------------------------");
                int option = scan.nextInt();
                if (option == 1) {
                    System.out.println("Qual valor deseja Depositar");
                    double valor = scan.nextDouble();
                    conta.depositar(valor);
                }
                if (option == 2) {
                    System.out.println("Qual valor deseja sacar");
                    double valor = scan.nextDouble();
                    conta.sacar(valor);
                }
                if (option == 3) {
                    conta.extrato();
                }
                if (option == 5) {
                    break;
                }
            }
        }else{
            System.out.println("Voce nao possui uma conta Corrente em aberto");
        }
        if(cliente.getCp() != null){
            while(true) {
                System.out.println("Voce possui uma conta Poupança em aberto");
                Poupanca conta = cliente.getCp();
                conta.extrato();
                System.out.println("------------------------------------------");
                System.out.println("[1] - Depositar");
                System.out.println("[2] - Sacar");
                System.out.println("[3] - extrato");
                System.out.println("[5] - exit");
                System.out.println("------------------------------------------");
                int option = scan.nextInt();
                if (option == 1) {
                    System.out.println("Qual valor deseja Depositar");
                    double valor = scan.nextDouble();
                    conta.depositar(valor);
                }
                if (option == 2) {
                    System.out.println("Qual valor deseja sacar");
                    double valor = scan.nextDouble();
                    conta.sacar(valor);
                }
                if (option == 3) {
                    conta.extrato();
                }
                if (option == 5) {
                    break;
                }
            }
        }else{
            System.out.println("Voce nao possui uma conta poupancaça em aberto");
        }
        System.out.println();
    }
}
