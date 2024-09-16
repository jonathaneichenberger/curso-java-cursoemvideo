public class Funcionario extends Pessoa {
    private String setor;
    public boolean trabalhando;

    public void mudaTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
