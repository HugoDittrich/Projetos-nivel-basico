import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class DesafioDeFluxo 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println(" ");
        System.out.println(" Desafio de CONTROLE DE FLUXO");
        System.out.println("------------------------------");
        System.out.println(" ");

        Boolean fazExercicio = true;

        while (fazExercicio)
        {
            try 
            {
                System.out.println(" ");
                System.out.print(" Entre o primeiro número : ");
                int numero1 = scanner.nextInt();
    
                System.out.print(" Entre o segundo número : ");
                int numero2 = scanner.nextInt();
    
                if ( numero1 >= numero2 )
                {
                    System.out.println(" ");
                    System.out.println(" ERRO => O primeiro número tem que ser MENOR do que o segundo");
                    System.out.println(" ");
                }
                else
                {
                    int contador = 1;
                    for ( ; numero1 < numero2; numero1++ )
                    {
                        System.out.println(contador + " => "+ numero1);
                        contador++;
                    }
                }
    
                char resposta = obterResposta();
                fazExercicio =  ( resposta == 's' ) ? true : false;

            } //* fim try */
            catch (InputMismatchException e) 
            {
                System.out.println("Entrada incorreta - entre com um número");
                scanner.next();
            }
        } //* fim while */
        scanner.close();
    }

    public static Character obterResposta() 
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        char resposta;
        boolean retornar = true;
        do
        {
            System.out.println(" ");
            System.out.print(" Deseja continuar (s/n) : ");
            resposta = Character.toLowerCase(scanner.next().charAt(0));
            if ( resposta == 's' || resposta == 'n' )
                retornar = false; 
            else
                System.out.println(" Opção inválida - digite 's' ou 'n' ");

        }
        while ( retornar );
        
        return resposta;
    }

}
