package Banco.model;

public class Cliente {
    private String nome;
    private String sobreNome;
    private Corrente Cc;
    private Poupanca Cp;
    private  boolean ativo;

    public Cliente(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Corrente getCc() {
        return Cc;
    }

    public void setCc(Corrente cc) {
        Cc = cc;
    }

    public Poupanca getCp() {
        return Cp;
    }

    public void setCp(Poupanca cp) {
        Cp = cp;
    }
}
