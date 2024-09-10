import java.util.Objects;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(double saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String dono, String tipo, int numConta) {
        this.setStatus(true);
        this.setDono(dono);
        this.setTipo(tipo);
        this.setNumConta(numConta);

        if (tipo.equals("CC") || tipo.equals("cc")) {
            setTipo("CC");
            setSaldo(50.0);
        } else if (tipo.equals("CP") || tipo.equals("cp")) {
            setTipo("CP");
            setSaldo(150.0);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Você tem R$:" + this.getSaldo() + " de saldo e precisa retirar esse valor para fechar a conta!");
        }else if (this.getSaldo() < 0){
            System.out.println("Você tem R$:" + this.getSaldo() + " de saldo negativo, regularize esse valor para fechar a conta!");
        }else{
            this.setNumConta(0);
            this.setDono("");
            this.setStatus(false);
        }
    }

    public void depositar(double valor) {
        if (status) {
            this.setSaldo(this.getSaldo() + valor);
        }else {
            System.out.println("Sua conta ainda não foi criada!");
        }
    }

    public void sacar(double valor) {
        if (status && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Você sacou R$:" + valor + " e sua conta agora possui saldo de R$:" + this.getSaldo());
        }
    }

    public void pagarMensalidade(double saldo, String tipo, int numConta) {
        if (status && this.getSaldo() >= 12 && (this.getTipo().equals("CC") || this.getTipo().equals("cc"))) {
            this.setSaldo(this.getSaldo() - 12);
        } else if (status && this.getSaldo() >= 20 && (this.getTipo().equals("CP") || this.getTipo().equals("cp"))) {
            this.setSaldo(this.getSaldo() - 20);
        }
    }

    public void consultarSaldo() {
        if(Objects.equals(this.getDono(), "")){
            System.out.println("Não foi encontrado nenhum cliente");
        }else{
            System.out.println("Cliente: " + this.getDono());
            System.out.println("Saldo atual: " + this.getSaldo());
        }

    }


}
