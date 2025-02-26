public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(Cliente cliente, int agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "Conta Poupança " + super.toString();
    }
}
