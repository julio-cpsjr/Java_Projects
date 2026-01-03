import java.util.Scanner;

public class processoSeletivo {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Processo Seletivo");
          System.out.println("Qual a sua pretenção salarial?");
          double salario = sc.nextDouble();
          analisarCandidato(salario);
      }
      static void analisarCandidato(double salarioPretendido) {
          if (salarioPretendido < 2000.0) {
              System.out.println("LIGAR PARA CANDIDATO");
          } else if (salarioPretendido == 2000.0) {
              System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
          } else System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
      }
}
