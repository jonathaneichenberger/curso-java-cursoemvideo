public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.5f);
        c1.status();
        System.out.println();
        Caneta c2 = new Caneta("Faber Castel", "Preta", 1.5f);
        c2.status();
    }
}