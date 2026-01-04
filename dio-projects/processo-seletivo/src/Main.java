import br.com.dio.dominio.ProcessoSeletivo;

public class Main {
      public static void main(String[] args) {
          double salarioPretendido = ProcessoSeletivo.salarioCandidato();
          ProcessoSeletivo.analisarCandidato(salarioPretendido);
      }

}
