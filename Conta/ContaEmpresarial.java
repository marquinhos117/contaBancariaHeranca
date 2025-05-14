package Conta;

import Pessoa.Cliente;

public class ContaEmpresarial extends Conta {
 private double chequeEspecial;
    public ContaEmpresarial(String numero, String agencia, double saldo, double chequeEspecial, String dataAbertura, Cliente titular) {
        super(numero, agencia, saldo, dataAbertura, titular);
        this.chequeEspecial = getSaldo() * 2;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


    @Override
    public boolean sacar(double valor){
        if(getSaldo() > 0 && valor <= getSaldo() * 2){
            setSaldo(getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }

}
