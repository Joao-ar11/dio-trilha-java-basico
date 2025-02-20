public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musica;

    @Override
    public void SelecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Agora tocando: " + musica);        
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }
    
}
