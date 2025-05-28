package Conta;


import Pessoa.PessoaJuridica;

public class ContaEmpresarial extends Conta {
 private double chequeEspecial;
 private PessoaJuridica titular;

    public ContaEmpresarial(String numero, String agencia, double saldo, double chequeEspecial, String banco, PessoaJuridica titular) {
        super(numero, agencia, saldo, banco);
        this.titular = titular;
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public PessoaJuridica getTitular() {
        return titular;
    }
    public void setTitular(PessoaJuridica titular) {
        this.titular = titular;
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
