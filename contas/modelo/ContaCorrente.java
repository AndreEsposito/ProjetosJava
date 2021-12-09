package modelo;

public class ContaCorrente extends Conta{
    // constante da taxa do depósito, e não há necessidade de deixar privada
    final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero) {
        // super = chama algo herdado
        super(numero);
    }

    @Override  // indica que o método será sobreescrito
    public boolean saque(double valor) {
        if (valor <= getSaldo()) {
            return super.saque(valor);
        }
        return false; // caso não tenha saldo suficiente
    }

    @Override // indica que o método será sobreescrito
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }

    @Override // indica que o método será sobreescrito
    public String toString() {
        return "Conta Corrente:. " + super.toString();
    }
}