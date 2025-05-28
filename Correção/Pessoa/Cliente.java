package Pessoa;

public class Cliente {
    private String nome;
    private String dataNasc;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String dataNasc, String telefone, Endereco endereco){
        this.nome = nome;

        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataNasc(){
        return dataNasc;
    }
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }

    public String setTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}


