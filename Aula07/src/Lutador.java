public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        this.setPeso(pe);
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }


    private void setCategoria() {
        if(getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (getPeso() <= 80.9) {
            this.categoria = "Médio";
        } else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos " + this.getAltura());
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("-------------------------------------");
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("-------------------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}
