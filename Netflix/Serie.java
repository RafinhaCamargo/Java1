package Netflix;

public class Serie extends Conteudo {
    private int numeroTemporadas;
    private int numeroEpisodeos;

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
    public int getNumeroEpisodeos() {
        return numeroEpisodeos;
    }
    public void setNumeroEpisodeos(int numeroEpisodeos) {
        this.numeroEpisodeos = numeroEpisodeos;
    }

    void toPlay(int temporada, int episodeo){
        super.toPlay();
        System.out.println("Temporada: "+temporada+" Episodeo: "+episodeo);
    }

    
}
