public class pessoateste {
    public static void main(String[] args){
        /*pessoa p1 = new pessoa();
        pessoa p2 = new pessoa();

        p1.nacionalidade = "brasileira";
        p2.nacionalidade = "brasileira";
        pessoa.nacionalidade = "brasileira";

        System.out.println("p1: "+p1.nacionalidade);
        System.out.println("p2: "+p1.nacionalidade);
        System.out.println("pessoa: "+p1.nacionalidade);
        pessoa.mostranacionalidade();
        pessoa.alteranacionalidade("Paraguaia");
        pessoa.mostranacionalidade();*/

        cliente c1 = new cliente();

        c1.alterarnome(nome:"João de Santo Cristo");
        c1.idade = 32;
        c1.rendamensal = 112358.13;

        System.out.println("nome: "+c1.consultanome());
    }
}
