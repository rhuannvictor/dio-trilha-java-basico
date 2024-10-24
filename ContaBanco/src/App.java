import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaCliente = new ContaTerminal(0, null, null, 0);
        System.out.println("Informe a sua conta:");
        contaCliente.conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a sua agência:");
        contaCliente.agencia = scanner.nextLine();
        System.out.println("Informe o seu nome:");
        contaCliente.nomeCliente = scanner.nextLine();
        System.out.println("Informe o valor a ser depositado para confirmação da conta:");
        contaCliente.saldo = scanner.nextDouble();
        scanner.nextLine();

        contaCliente.apresentarDados();
        scanner.close();
    }
}
