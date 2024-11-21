package aula11;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsita. Pagamento realizado");
    }


    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
