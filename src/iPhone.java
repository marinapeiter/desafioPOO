import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.ReprodutorMusical;
import Funcionalidades.Safari;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, Safari {

    @Override
    public void tocar() {
        System.out.println("Play na música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrir página da web");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
