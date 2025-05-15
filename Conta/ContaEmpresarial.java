package Conta;

import Pessoa.Cliente;

public class ContaEmpresarial extends Conta {
 private double chequeEspecial;
    public ContaEmpresarial(String numero, String agencia, double saldo, double chequeEspecial, String dataAbertura, Cliente titular) {
        super(numero, agencia, saldo, dataAbertura, titular);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


    @Override
    public boolean sacar(double valor){
        if(getSaldo() > 0 && valor <= getSaldo() + chequeEspecial){
            setSaldo(getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }

    @Override
     public boolean transferir(double valor, Conta contaDestino){
        if(valor > 0 && valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            contaDestino.depositar(valor);
            return true;
        }else{
            return false;
        }
     }

}
