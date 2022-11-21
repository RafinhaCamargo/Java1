public class cachorro extends mamifero {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    void latir(){
        System.out.println("Au! Au!");
    }
}
