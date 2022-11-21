package Prime;

public class Conteudo {
    private String Titulo;
    private String Genero;
    private int Duracao;
    private String sinopse;
    
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    public int getDuracao() {
        return Duracao;
    }
    public void setDuracao(int duracao) {
        Duracao = duracao;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    void Toplay(){
        System.out.println("playing "+this.Titulo);
        System.out.println("Duração: "+this.Duracao);
    }
}
