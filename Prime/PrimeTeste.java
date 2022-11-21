package Prime;

public class PrimeTeste {
    public static void main(String[] args){
        Serie s = new Serie();
        s.setTitulo("Gambito da Rainha");
        s.setGenero("Obra de época");
        s.setNumeroTemporadas(1);
        s.setNumeroEpisodeos(7);
        s.setDuracao(50);

        s.Toplay(1, 7);
    }

}
