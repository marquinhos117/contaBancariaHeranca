package Conta;

import Pessoa.PessoaFisica;

public class ContaCorrente extends Conta {//Não cloquei nenhuma validação ou método novo pois na classe mãe já tem os métodos padrões que por sí só não deixam o valor ficar negativo
    private PessoaFisica titular;

    public ContaCorrente(String numero, String agencia, double saldo, String banco, PessoaFisica titular) {
        super(numero, agencia, saldo, banco);
        this.titular = titular;

    }

     public PessoaFisica getTitular() {
         return titular;
     }

     public void setTitular(PessoaFisica titular) {
         this.titular = titular;
     }

     public boolean sacar(double valor){
         if(getSaldo() > 0 && valor <= getSaldo()){
             setSaldo(getSaldo() - valor);
             return true;
            }else{
                return false;
            }
        }

    }




