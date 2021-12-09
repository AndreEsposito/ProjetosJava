package modelo;

public class ContaPoupanca extends Conta{
    private static double taxaPorOperacao = 0.2; // 

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override // indica que o método será sobreescrito
    public boolean saque(double valor) {
        if (valor + taxaPorOperacao <= getSaldo()) {
            // saca o dinheiro solicitado e desconta a taxa no saldo 
            return super.saque(valor + taxaPorOperacao);
        }
        return false; // caso o saldo seja insuficiente
    }

    // set = para modificar a taxa
    // 
    public static void setTaxaPorOperacao(double novaTaxaPorOperacao) { 
        taxaPorOperacao = novaTaxaPorOperacao;
    }
    
    @Override // indica que o método será sobreescrito
    public String toString() {
        return "Conta Poupança:. " + super.toString() + "\nTaxa: " + taxaPorOperacao;
    }
}
