public class iPhone implements Reprodutor, Aparelho, Navegador {
    private Reprodutor reprodutorMusical;
    private Aparelho aparelhoTelefonico;
    private Navegador navegadorInternet;

    public iPhone(Reprodutor reprodutor, Aparelho aparelho, Navegador navegador) {
        this.reprodutorMusical = reprodutor;
        this.aparelhoTelefonico = aparelho;
        this.navegadorInternet = navegador;
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }

    @Override
    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}

