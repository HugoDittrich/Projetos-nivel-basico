import java.util.*;

public class UsoWhile 
{
    public static void main(String[] args) 
    {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println(" Teste do while");
        System.out.println("---------------------------");
        System.out.println(" ");

        System.out.println(" Valor da mesada: ");
        double valorMesada = scanner.nextDouble();
        scanner.close();

        double valorGasto = valorAleatorio(valorMesada);

        while (valorGasto <= valorMesada)
        {
            //* Double valorGasto = valorAleatorio();
            valorMesada = valorMesada - valorGasto;
            System.out.println("Valor gasto = " + valorGasto + " - e ainda tem " + valorMesada + "para gastar");
            valorGasto = valorAleatorio(valorMesada);
        }


    } //* fim public static void main */

    private static double valorAleatorio(double saldoMesada)
    {
        Random random = new Random();
        return 1 + (saldoMesada - 1) * random.nextDouble();
        //* retorna um valor aleatório com base no saldo da mesada */
    } 

} //* fim programa */


