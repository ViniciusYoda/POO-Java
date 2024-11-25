package projetoyoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de poo");
        v[1] = new Video("Aula 12 de php");
        v[2] = new Video("Aula 10 de html");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Fred", 17, "M", "FredAm");
        g[1] = new Gafanhoto("Daphne", 17, "F", "DaphneRo");
        

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
    }
}