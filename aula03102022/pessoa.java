//package "aula03102022";

class pessoa{
    //atributos
    String nome;
    double altura;
    static String nacionalidade;
    //metodos
    static void mostranacionalidade(){
        System.out.println("nacionalidade: ");
        System.out.println(pessoa.nacionalidade);
    }
    static void alteranacionalidade(String novanac){
        pessoa.nacionalidade = novanac;
    }
}