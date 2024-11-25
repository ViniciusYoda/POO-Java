package projetoyoutube;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssitido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
    }

    public void viuMaisUm(){

    }


    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return this.totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }


    @Override
    public String toString() {
        return "{" +
            " Gafanhoto='" + super.toString() + 
            " login='" + getLogin() + "'" +
            ", totAssitido='" + getTotAssitido() + "'" +
            "}";
    }


    
}
