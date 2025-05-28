package Conta;


import Pessoa.PessoaFisica;

public class ContaEspecial extends Conta{
    private double chequeEspecial;
    private PessoaFisica titular;

    public ContaEspecial(String numero, String agencia, double saldo, double chequeEspecial, String banco, PessoaFisica titular) {
        super(numero, agencia, saldo, banco);
        this.titular = titular;
        this.chequeEspecial = chequeEspecial;
    }

    public PessoaFisica getTitular() {
        return titular;
    }
    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


    @Override
    public boolean sacar(double valor){
        if(getSaldo() >= 0 && valor <= getSaldo() + chequeEspecial){
            setSaldo(getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }



}
