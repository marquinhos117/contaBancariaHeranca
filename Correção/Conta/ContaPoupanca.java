package Conta;

import Pessoa.PessoaFisica;

public class ContaPoupanca extends Conta{
    private PessoaFisica titular;

    public ContaPoupanca(String numero, String agencia, double saldo, String banco, PessoaFisica titular) {
        super(numero, agencia, saldo, banco);
        this.titular = titular;
    }




    public PessoaFisica getTitular() {
        return titular;
    }
    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }

    public boolean rendimento(){
        setSaldo(getSaldo() * 0.005);
        return true; //como a execução vai ocorrer sempre que o metodo for chamado não coloquei condicao
    }
}
