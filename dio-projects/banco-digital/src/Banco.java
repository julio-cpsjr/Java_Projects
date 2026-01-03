import java.util.ArrayList;
import java.util.List;


public class Banco {

    private String nome;
    private List<List<String>> matrizContas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatrizContas(List<String> contaC,List<String> contaP ) {
        matrizContas.add(contaC);
        matrizContas.add(contaP);
    }

    public List<List<String>> getMatrizContas() {
        return matrizContas;
    }
}
