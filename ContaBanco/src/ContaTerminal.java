
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o número da sua conta:");
        int numeroDaConta = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, insira seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, insira o número da Agência:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, insira o seu saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());
        scanner.close();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
