public class clinicateste {
    public static void main(String[] args){
        cachorro toto = new cachorro();
        toto.setDataDeNascimento("25/10/1999");
        toto.setEspecie("canina");
        toto.setGenero("familiris");
        toto.setRaca("boder collie");
        toto.setTipoSanguineo("SRD");

        gato billy = new gato();
        billy.setCorDoPelo("marrom");
        billy.setDataDeNascimento("23/01/2010");
        billy.setEspecie("felino");
        billy.setGenero("Felix");
        billy.setTipoSanguineo("O-");

        clinica c = new clinica();
        c.setEndereco("Av. Brasil, 1111");
        c.setNome("Vet feliz");

        c.realizarCirurgia(billy);
        c.realizarCirurgia(toto);
    }
}
