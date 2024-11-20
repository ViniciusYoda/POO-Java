package aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float aum) {
        System.out.println("Receber aumento");
        this.salario += aum;
    }


    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}