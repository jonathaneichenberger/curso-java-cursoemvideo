public class Main {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco(0,false);
        conta1.abrirConta("Jubileu", "CP", 0001);
        conta1.consultarSaldo();
        conta1.pagarMensalidade(conta1.getSaldo(), conta1.getTipo(), conta1.getNumConta());
        conta1.depositar(2000);
        conta1.consultarSaldo();
        conta1.fecharConta();
        conta1.sacar(2130);
        conta1.fecharConta();
        conta1.consultarSaldo();

        ContaBanco conta2 = new ContaBanco(0,false);
        conta2.abrirConta("Creuza", "CC", 0001);
        conta2.consultarSaldo();

    }
}