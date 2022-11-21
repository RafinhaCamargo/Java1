package Netflix;

import java.util.Date;

public class Conteudo {
    private String titulo;
    private String genero;
    private String sinopse;
    private int duracao; // em minutos
    private int classificacaoIndicativa; //idade minima

    // Getters e Setters
    private Date dataDeLancamento;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public Date getDataDeLancamento() {
        return dataDeLancamento;
    }
    public void setDataDeLancamento(Date dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    void toPlay(){
        System.out.println("Playing "+this.titulo);
    }

    

}
