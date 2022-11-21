package uber;

public class passageiro extends viagem { //heranca
    private String NomePassageiro;
    private int IdadePassageiro;
    //encapsulamento
    public String getNomePassageiro() {
        return NomePassageiro;
    }
    public void setNomePassageiro(String nomePassageiro) {
        NomePassageiro = nomePassageiro;
    }
    public int getIdadePassageiro() {
        return IdadePassageiro;
    }
    public void setIdadePassageiro(int idadePassageiro) {
        IdadePassageiro = idadePassageiro;
    }

}
