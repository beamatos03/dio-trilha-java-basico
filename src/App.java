import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal objConta = new ContaTerminal();        
        Scanner entrada = new Scanner(System.in);
        


        System.out.print("Por favor, digite o número da agência: ");
        objConta.setNumero(entrada.nextInt());
        System.out.print("Por favor, digite a agência: ");
        objConta.setAgencia(entrada.next());
        System.out.print("Por favor, digite o nome do cliente: ");
        objConta.setNome_cliente(entrada.next());
        System.out.print("Por favor, digite o valor do saldo: ");
        objConta.setSaldo(entrada.nextDouble());

    System.out.println("Olá " + objConta.getNome_cliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + objConta.getAgencia() + ", conta " + objConta.getNumero() + " e seu saldo R$" + objConta.getSaldo() + " já está disponível para saque");


    entrada.close();
    }
}
