import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Número  ");
        int numero = scanner.nextInt();
        System.out.println("Digite sua Agência  ");
        String agencia = scanner.next();
        System.out.println("Digite seu nome ");
        String nome = scanner.next();
        System.out.println("Digite seu saldo ");
        double saldo = scanner.nextDouble();
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
