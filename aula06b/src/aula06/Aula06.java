package aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.fecharMenu();
        c.desligar();
    }
}