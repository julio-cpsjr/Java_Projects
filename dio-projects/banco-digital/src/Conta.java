import java.util.ArrayList;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public ArrayList<String> setContas(ArrayList<String> contaCP) {
        contaCP.add("Titular: " + this.cliente.getNome());
        contaCP.add("Agência: " + this.agencia);
        contaCP.add("Conta: " + this.numero);
        contaCP.add("Saldo: " + this.saldo);
        return contaCP;
    }


    protected void imprimirInfosComuns(){
        System.out.printf("Titular: %s \n", this.cliente.getNome());
        System.out.printf("Agência: %d \n", this.agencia);
        System.out.printf("Conta: %d \n", this.numero);
        System.out.printf("Saldo: %.2f \n", this.saldo);
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
