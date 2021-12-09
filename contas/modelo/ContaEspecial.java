package modelo;

public class ContaEspecial extends Conta{
    private double limite;
    
    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override // indica que o método será sobreescrito
    public boolean saque(double valor) {
        if (valor <= getSaldo() + limite) {
            return super.saque(valor);
        }
        return false; // caso não tenha saldo + limite disponível
    }

    @Override // indica que o método será sobreescrito
    public String toString() {
        return "Conta Especial:. " + super.toString() + " Limite: " + limite;
    }
}
