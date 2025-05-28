package Conta;


abstract public class Conta {
     private String numero;
     private String agencia;
     private String banco;
     private double saldo;


     public Conta(String numero, String agencia, double saldo, String banco) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
        this.banco = banco;

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

     public String getBanco() {
         return banco;
     }
     public void setBanco(String banco) {
         this.banco = banco;
     }





     public boolean sacar(double valor){
        if(saldo >= 0 && valor >= saldo){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
     }

     public boolean depositar(double valor){
        if(valor >= 0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
     }

    public boolean transferir(double valor, ContaCorrente conta){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(double valor, ContaPoupanca conta){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(double valor, ContaEspecial conta){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(double valor, ContaEmpresarial conta){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }


    }


