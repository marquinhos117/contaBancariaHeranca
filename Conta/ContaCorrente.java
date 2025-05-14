package Conta;

import Pessoa.Cliente;

public class ContaCorrente extends Conta {//Não cloquei nenhuma validação ou método novo pois na classe mãe já tem os métodos padrões que por sí só não deixam o valor ficar negativo

    public ContaCorrente(String numero, String agencia, double saldo, String dataAbertura, Cliente titular) {
        super(numero, agencia, saldo, dataAbertura, titular);
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
