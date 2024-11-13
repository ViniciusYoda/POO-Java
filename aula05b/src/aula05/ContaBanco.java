package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if("CC".equals(t)) {
            this.setSaldo(50);
        } else  if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberto com sucesso!");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, não pode ser fechado");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, não pode ser fechado por falta de débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta do " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println(("Dinheiro sacado com sucesso"));
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if(this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true) {
            if(this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar com uma conta fechada");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    

    
}