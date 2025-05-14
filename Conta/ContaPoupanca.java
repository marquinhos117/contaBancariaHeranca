package Conta;

import Pessoa.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numero, String agencia, double saldo, String dataAbertura, Cliente titular) {
        super(numero, agencia, saldo, dataAbertura, titular);
    }

    public boolean rendimento(){
        setSaldo(getSaldo() * 0.005);
        return true; //como a execução vai ocorrer sempre que o metodo for chamado não coloquei condicao
    }

}
