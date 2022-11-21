package Netflix;

public class NetflixTeste {
    public static void main(String[] args){
        // Adicionar Série
        Filme filme = new Filme();
        filme.setTitulo("Breaking Bad");
        filme.setGenero("Ação");
        filme.setDuracao(60);
        filme.setDiretor("Adrian Neway");
        filme.setDistribuidora("filinhos da vovo");

        filme.playFilme(filme);
    }
}
