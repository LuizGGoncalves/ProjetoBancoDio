package Banco.model;

import Banco.model.interfaces.BancoInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco implements BancoInterface {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    @Override
    public Cliente acessarCliente() {
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("-----------------------------------------------------");
        System.out.println("Selecione o usuario com base no codigo");
        for(int i = 0; i < this.clientes.toArray().length; i++){
            Cliente user = this.clientes.get(i);
            System.out.println(user.getNome() + " Codigo --> " + "[" + i + "]" );
        }
        System.out.println("-------------------------------------------------------");
        option = scan.nextInt();
        return  this.clientes.get(option);
    }
    @Override
    public void createCliente(String nome, String sobreNome, int conta) {
        Cliente usuario = new Cliente(nome,sobreNome);
        this.clientes.add(usuario);
        if(conta == 1){
            Corrente contaCorrente = new Corrente(this.clientes.toArray().length);
            usuario.setCc(contaCorrente);
        }else {
            Poupanca contaPoupanca = new Poupanca(this.clientes.toArray().length);
            usuario.setCp(contaPoupanca);
        }
    }
    @Override
    public Cliente mostraMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-------------Seja Bem vindo ao banco " + this.nome + " --------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1-Cadastro");
        System.out.println("2-Acessar Conta");
        int option = scan.nextInt();
        if(option == 1){
            System.out.println("-----------------------------------------------------");
            System.out.println("Nome:");
            String nome = scan.next();
            System.out.println("Sobrenome");
            String sobreNome = scan.next();
            System.out.println("Tipo de Conta: [1] Conta Corrente   [2] Poupança");
            int conta = scan.nextInt();
            createCliente(nome,sobreNome,conta);
            System.out.println("Cadastro criado com sucesso");
            return mostraMenu();
        }else if(option == 2){
            return acessarCliente();
        }else{
           return mostraMenu();
        }
    }
}
