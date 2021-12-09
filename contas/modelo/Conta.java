package modelo;

public abstract class Conta { // classe abstrata = modelo para outras classes, não pode instanciar objetos
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    
    @Override // indica que o método será sobreescrito         
    public String toString() { // toString(), serve para não ser preciso chamar o método no App
        return numero + ": " + String.format("R$%.2f", saldo);
    }
} 