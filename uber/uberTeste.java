package uber;
// classe abstrata

public abstract class uberTeste {
    //adicionar viagem
    public static void main(String[] args){ //Polimorfismo e interface
        viagem v = new viagem();
        v.setPontodePartida("Fatec Pompeia");
        v.setDestino("Posto Paineira");
        v.setDistancia(2.0);
        v.setValor(5.0);

        v.start(v);
    }
}

//Rafael Camargo dos santos --- Gabriel Passi Sanches