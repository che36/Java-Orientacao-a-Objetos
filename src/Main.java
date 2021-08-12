
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setCliente_Tipo("Pessoa Juridica");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        Conta especial = new ContaEspecial(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
