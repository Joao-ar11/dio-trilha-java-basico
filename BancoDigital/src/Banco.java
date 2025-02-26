import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
	private List<Conta> contas = new ArrayList<>();

    public static enum TiposConta {
        CORRENTE,
        POUPANCA
    }

    public Banco(String nome) {
        this.nome = nome;
    }

    public Conta adicionarConta(Cliente cliente, TiposConta tipo) {
        Conta conta;
        if (tipo == TiposConta.CORRENTE) {
            conta = new ContaCorrente(cliente);
        } else {
            conta = new ContaPoupanca(cliente);
        }
        contas.add(conta);
        return conta;
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public void removerConta(int numero) {
        contas.removeIf(conta -> conta.getNumero() == numero);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
