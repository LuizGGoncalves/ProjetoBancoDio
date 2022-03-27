package Banco.model.interfaces;

import Banco.model.Cliente;

public interface BancoInterface {
    Cliente acessarCliente();
    void createCliente(String nome,String sobreNome, int conta);
    Cliente mostraMenu();
}
