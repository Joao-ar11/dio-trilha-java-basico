public class Main {

    public static void main(String[] args) {
		Cliente novoCliente = new Cliente("Fulano");
		Banco banco = new Banco("Banco Nacioinal");
		
		Conta cc = banco.adicionarConta(novoCliente, Banco.TiposConta.CORRENTE);
		Conta poupanca = banco.adicionarConta(novoCliente, Banco.TiposConta.POUPANCA);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		System.out.println(banco.getContas());
		System.out.println("----------------------------------");
		cc.imprimirExtrato();
		System.out.println("----------------------------------");
		poupanca.imprimirExtrato();
	}
}
