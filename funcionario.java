public class funcionario {
    //atributos
    String nome;
    String cargo;
    double salario;
    String dataDeNasc;

    //metodos

    void imprimirDadosFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Nascimento: " + this.dataDeNasc);
    }

      double aumentaSalario(double valorAumento){
        double porc = valorAumento/this.salario;
        this.salario += valorAumento;
        System.out.println("Salário Aumentado com sucesso para " + this.salario);
        return porc;

    }
}