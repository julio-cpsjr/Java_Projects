import java.util.Scanner;

public class contaTerminal {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, digite o seu nome");
    String nome = sc.nextLine();
    System.out.println("Por favor, digite o número da sua Agência");
    String agencia = sc.nextLine();
    System.out.println("Por favor, digite o seu número da sua conta");
    int conta = sc.nextInt();
    System.out.println("Por favor, digite o seu saldo");
    double saldo = sc.nextDouble();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s reais, já está disponível para saque",nome,agencia,conta,saldo);


  }
}
