package dados;
 
import java.util.HashMap;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial; 
import modelo.ContaPoupanca; 

public class GerenciaContasHash {
    private HashMap<Integer, Conta> mapaDeContas; 

    public GerenciaContasHash() {
        mapaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        mapaDeContas.put(numeroConta, new ContaCorrente(numeroConta)); 
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        mapaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        mapaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean deposito(int numeroConta, double valor) {

        Conta contas = mapaDeContas.get(numeroConta);

        if (contas != null) {
            return contas.deposito(valor);
        } else {
            return false;
        }
    }

    public boolean saque(int numeroConta, double valor) {

        Conta contas = mapaDeContas.get(numeroConta);

        if (contas != null) {
            return contas.saque(valor);
        } else {
            return false;
        }
    }

    public String getSaldo(int numeroConta) {

        Conta contas = mapaDeContas.get(numeroConta);

        if (contas != null) {
            return contas.toString();
        }
        return "Conta não encontrada!";
    }
}