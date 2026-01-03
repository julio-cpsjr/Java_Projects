import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Banco bank = new Banco();
        String nomeBanco = inserirBanco();
        bank.setNome(nomeBanco);
        String nomeCliente = inserirCliente(nomeBanco);
        Cliente client = new Cliente();
        client.setNome(nomeCliente);
        System.out.printf("=== Bem vindo %s === \n", nomeCliente);
        System.out.println(".... Criando as contas");
        Conta cc = new ContaCorrente(client);
        Conta cp = new ContaPoupanca(client);
        System.out.println("... Contas criadas, imprimindo extrato das contas...");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        System.out.println("Obrigado, volte sempre.");
        ArrayList<String> contaC = new ArrayList<String>();
        ArrayList<String> contaP = new ArrayList<String>();
        bank.setMatrizContas(cc.setContas(contaC),cp.setContas(contaP));
    }
    static String inserirBanco(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Bem vindo ao Hub de Bancos ===");
        System.out.println("Por favor, insira o nome do Banco.");
        return sc.nextLine();
    }
    static String inserirCliente(String banco){
        Scanner sc = new Scanner(System.in);
        System.out.printf("=== Bem vindo ao %s === \n",banco);
        System.out.println("Por favor insira o nome do Titular.");
        return sc.nextLine();
    }
}
