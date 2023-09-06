import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int numero;
        String agencia, nome_cliente;
        double saldo;

        System.out.print("Por favor, digite o número da agência: ");
        numero = entrada.nextInt();
        System.out.print("Por favor, digite a agência: ");
        agencia = entrada.next();
        System.out.print("Por favor, digite o nome do cliente: ");
        nome_cliente = entrada.next();
        System.out.print("Por favor, digite o valor do saldo: ");
        saldo = entrada.nextDouble();

    System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque");

    entrada.close();
    }
}
