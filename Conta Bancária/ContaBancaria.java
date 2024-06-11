import java.util.*;

// import java.util.Scanner.Scanner;
// import java.util.Locale.US;

public class ContaBancaria 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println(" Gestão de conta bancária");
        System.out.println("---------------------------");
        System.out.println(" ");

        System.out.println(" Nome do cliente: ");
        String nome = scanner.next();

        System.out.println(" Agência do cliente: ");
        String agencia = scanner.next();

        System.out.println(" Número da conta corrente: ");
        int contaCorrente = scanner.nextInt();

        System.out.println(" Valor da retirada: ");
        double valorRetirada = scanner.nextDouble();

        double saldo = 1234.56;

        System.out.println(" ");
        System.out.println(" Saldo após a retirada");
        System.out.println("---------------------------");
        System.out.println(" ");

        System.out.println("Conta corrente de " + nome );
        System.out.println("da Agência e número de conta: " + agencia + " - " + contaCorrente  );
        System.out.println("Saldo atual: " + (saldo - valorRetirada) );

        System.out.println(" ");
        System.out.println("---------------------------");
        

    }
    
}