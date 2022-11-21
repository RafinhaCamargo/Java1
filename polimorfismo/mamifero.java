public class mamifero extends animal {
    private String tipoSanguineo;

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    void mamar(){
        System.out.println("Mamifero mama");
    }
}
