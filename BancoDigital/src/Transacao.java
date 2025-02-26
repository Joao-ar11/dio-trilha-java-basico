public record Transacao(Tipo tipo, double valor) {

    public static enum Tipo {
        DEPOSITO,
        SAQUE,
        TRANSFERENCIA
    }

    @Override
    public String toString() {
        return String.format("%s de %.2f", tipo, valor);
    }

}
