import java.util.Scanner;

//import dados.GerenciaContas;
import dados.GerenciaContasHash;

public class AppContas {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, numeroConta; 
        double limite, valor;

        // ContaCorrente cc = null; - juntou td na linha 16
        // ContaEspecial ce = null; 
        // ContaPoupanca cp = null;

        GerenciaContasHash contas = new GerenciaContasHash();

        while (opcao != 7) {
            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupança");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            
            switch (opcao) {
                case 1:
                    System.out.print("Informe o número da sua conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.print("Informe o número da sua conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.print("Informe seu limite: ");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.print("Informe o número da sua conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.print("Informe o número da sua conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor desejado: ");
                    valor = teclado.nextInt();

                    if (contas.deposito(numeroConta, valor)) {
                        System.out.println("Depósito efetuado com sucesso!");
                    } else {
                        System.out.println("Depósito Inválido!");
                    }
                    break;
                case 5:
                    System.out.print("Informe o número da sua conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor desejado: ");
                    valor = teclado.nextDouble(); 

                    if (contas.saque(numeroConta, valor)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Falha na operação!");
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();

                    System.out.println(contas.getSaldo(numeroConta));
                    
                    break;
                case 7:

                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

        

        teclado.close();
    }
}