import java.util.ArrayList;
import java.util.List;

public abstract  class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private Cliente cliente;
    private int agencia;
    private int numero;
    private double saldo = 0d;
    private List<Transacao> transacoes = new ArrayList<>(); 

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public Conta(Cliente cliente, int agencia) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        Transacao novaTransacao = new Transacao(Transacao.Tipo.DEPOSITO, valor);
        transacoes.add(novaTransacao);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        Transacao novaTransacao = new Transacao(Transacao.Tipo.SAQUE, valor);
        transacoes.add(novaTransacao);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.agencia == contaDestino.getAgencia()) {
            this.saldo -= valor;
            Transacao novaTransacao = new Transacao(Transacao.Tipo.TRANSFERENCIA, valor);
            transacoes.add(novaTransacao);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Transferências são permitidas apenas para contas da mesma instituição");
        }
    }

    @Override
    public int getAgencia() {
        return agencia;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));

        if (!transacoes.isEmpty()) {
            System.out.println("Transações realizadas:");
            transacoes.forEach(System.out::println);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    @Override
    public String toString() {
        return "Número: " + numero;
    };
}
