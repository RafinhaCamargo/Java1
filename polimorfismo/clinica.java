public class clinica {
    private String nome;
    private String endereco;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void realizarCirurgia(animal a){
        System.out.println("Cirurgia realizada em: "+a.getEspecie());
    }
}
