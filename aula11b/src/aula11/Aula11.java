package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Clark");
        v1.setIdade(24);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Pete");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Politica");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Chloe");
        b1.setIdade(17);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
    }
}