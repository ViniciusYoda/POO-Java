package aula02;

public class Aula02 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "hOSTNET";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}