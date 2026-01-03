import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double usuario = usuarioSelecao();
        if (usuario == 1){
            appMusica();
        } else if (usuario == 2) {
            telefone();
        }else internet();
    }
    static double usuarioSelecao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ligando o iphone");
        System.out.println("Selecione a opção:");
        System.out.println("1 - App Musica");
        System.out.println("2 - Telefone");
        System.out.println("3 - Navegador");
        return sc.nextDouble();
    }
    static void appMusica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção:");
        System.out.println("1 - Tocar");
        System.out.println("2 - Pausar");
        System.out.println("3 - Selecionar");
        double musica = sc.nextDouble();
        if(musica == 1){ ReprodutorMusical.tocar();}
        else if(musica == 2){
            ReprodutorMusical.pausar();}
        else ReprodutorMusical.selecionarMusica();
    }
    static void telefone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção:");
        System.out.println("1 - Atender");
        System.out.println("2 - Ligar");
        System.out.println("3 - Correio de Voz");
        double chamada = sc.nextDouble();
        if(chamada == 1){ AparelhoTelefonico.atender();}
        else if(chamada == 2){
            AparelhoTelefonico.ligar();}
        else AparelhoTelefonico.iniciarCorreioVoz();
    }
    static void internet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção:");
        System.out.println("1 - Abrir navegador");
        System.out.println("2 - Abrir nova aba");
        System.out.println("3 - Atualizar Página");
        double pagina = sc.nextDouble();
        if(pagina == 1){ NavegarNaInternet.exibirPagina();}
        else if(pagina == 2){
            NavegarNaInternet.adicionarNovaAba();}
        else NavegarNaInternet.atualizarPagina();
    }

}
