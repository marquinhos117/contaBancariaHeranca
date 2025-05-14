package Pessoa;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, String dataNasc, String telefone, Endereco endereco) {
        super(nome, dataNasc, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}