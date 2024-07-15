import java.util.*;

public class CaixaEletronica 
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
        double limite = 5000.00;
        boolean contaEspecial = true;

        if (saldo >= valorRetirada)
        {
            saldo = saldo - valorRetirada;
            System.out.println(" ");
            System.out.println(" Saldo após a retirada");
            System.out.println("---------------------------");
            System.out.println(" ");
    
            System.out.println("Conta corrente de " + nome );
            System.out.println("da Agência e número de conta: " + agencia + " - " + contaCorrente  );
            System.out.println("Novo saldo de: " + saldo);
    
            System.out.println(" ");
            System.out.println("---------------------------");
        }
        else 
        {
            if (contaEspecial)
            {
                saldo = saldo - valorRetirada;
                if (saldo <= limite)
                {
                    limite = limite + saldo;
                    System.out.println(" Saldo passou para negativo");
                    System.out.println(" conta ESPECIAL => usando crédito rotativo dentro do limite");
                    System.out.println(" Limite disponível: " + limite);
                    System.out.println("---------------------------");
                    System.out.println(" ");
                }
                else
                {
                    System.out.println(" ");
                    System.out.println(" Saldo INSUFICIENTE para retirada");
                    System.out.println(" limite de saldo NEGATIVO acima do permitido");
                    System.out.println("---------------------------");
                    System.out.println(" ");                   
                }
            }
            else 
            {
                System.out.println(" ");
                System.out.println(" Saldo INSUFICIENTE para retirada");
                System.out.println("---------------------------");
                System.out.println(" ");
            }
        }

        int a=0, b=0, c=0, d=0;
        Boolean verdade = true;
        Random r = new Random();
        for(int i=0; i<32000 && verdade; i++) 
        {
            try 
            {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
                System.out.println("a: " + a);                    } 
            catch (ArithmeticException e) 
            {
                System.out.println("Division by zero.");
                System.out.println(b + " - " + c);
                a = 0; // set a to zero and continue
                verdade = false;
                System.out.println("* * * E o erro foi => " + e.toString()); 
            }
        }




    }
}
