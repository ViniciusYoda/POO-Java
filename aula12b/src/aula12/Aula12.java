package aula12;

public class Aula12 {

    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();

        c.locomover();
        ca.emitirSom();
        co.locomover();
        t.locomover();
        g.locomover();
        ar.locomover();

        
    }
}