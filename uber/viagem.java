package uber;

public class viagem{
    private String PontodePartida;
    private String Destino;
    private double Distancia; //em KM
    private double valor; // Reais
    //encapsulamento
    public String getPontodePartida() {
        return PontodePartida;
    }
    public void setPontodePartida(String pontodePartida) {
        PontodePartida = pontodePartida;
    }
    public String getDestino() {
        return Destino;
    }
    public void setDestino(String destino) {
        Destino = destino;
    }
    public double getDistancia() {
        return Distancia;
    }
    public void setDistancia(double distancia) {
        Distancia = distancia;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) { //exception
        this.valor = valor;
    }
    void start(viagem a){
        System.out.println("iniciando viagem de: "+this.PontodePartida+ " até: "+this.Destino);
    }
    
}