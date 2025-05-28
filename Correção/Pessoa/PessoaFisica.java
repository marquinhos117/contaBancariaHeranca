package Pessoa;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String cpf, String dataNasc, String telefone, Endereco endereco) {
        super(nome, dataNasc, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
