package Conta;

import Pessoa.Cliente;

public class Conta {
     private String numero;
     private String agencia;
     private double saldo;
     private String dataAbertura;
     private Cliente titular;

     public Conta(String numero, String agencia, double saldo, String dataAbertura, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
        this.dataAbertura = dataAbertura;
        this.titular = titular;
    }

     public String getNumero() {
         return numero;
     }
     public void setNumero(String numero) {
         this.numero = numero;
     }

     public String getAgencia() {
         return agencia;
     }
     public void setAgencia(String agencia) {
         this.agencia = agencia;
     }

     public double getSaldo() {
         return saldo;
     }
     public void setSaldo(double saldo) {
         this.saldo = saldo;
     }

     public String getDataAbertura() {
         return dataAbertura;
     }
     public void setDataAbertura(String dataAbertura) {
         this.dataAbertura = dataAbertura;
     }

     public Cliente getTitular() {
         return titular;
     }
     public void setTitular(Cliente titular) {
         this.titular = titular;
     }

     public boolean sacar(double valor){
        if(saldo > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
     }

     public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
     }

     public boolean transferir(double valor, Conta contaDestino){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            contaDestino.depositar(valor);
            return true;
        }else{
            return false;
        }
     }

}
