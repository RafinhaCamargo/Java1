import java.net.InetAddress;

class cliente {
    //atributos
    private String nome;
    int idade;
    double rendamensal;

    //metodos
    void alterarnome(String nome){
        this.nome = nome;
    }
    
    String consultanome(){
        return this.nome;
    }
}
