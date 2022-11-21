public class gato extends mamifero {
    private String corDoPelo;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    void miar(){
        System.out.println("Miau!");
    }
}
