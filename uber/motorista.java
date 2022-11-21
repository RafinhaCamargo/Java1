package uber;
 //Heranca
public class motorista extends viagem {
    private String nome;
    private int Idade;
    private String Genero;

    // encapsulamento
    public String getNome() {
        return nome; //exception
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return Idade; 
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public String getGenero() {
        return Genero;  
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    
    
}
