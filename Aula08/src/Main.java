public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jonathan", 37, "M");
        p[1] = new Pessoa("Vania", 37, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("Poo para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Anvançado", "Maria Candido", 800, p[0]);

        System.out.println(l[0].detalhes());
    }
}