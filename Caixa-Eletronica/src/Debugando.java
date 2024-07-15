import java.util.Arrays;
import java.util.List;

public class Debugando 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("------------------------");
        System.out.println("Iniciou pilha de Métodos");
        a();
        System.out.println("------------------------");
        System.out.println("Fim da pilha de Métodos");
        System.out.println(" ");


        int day = 4;
        switch (day) 
        {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
               break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
            case 5:
                System.out.println("Friday");
               break;
            case 6:
                System.out.println("Saturday");
               break;
            default:
                System.out.println("Sunday");
        }

        int contador = 0;
        do 
        {
            contador++;
            if ( contador >= 8 )
            {
                System.out.println( "--continue do DO WHILE-- " + contador);
                if ( contador < 11 )
                    continue;
                else
                    break;
            }
            System.out.println( contador );
        } while ( contador < 13 );

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");
        contador = 1;
        for ( ; contador < 10; contador++ )
        {
            if ( contador > 3 && contador < 6 )
            {
                System.out.println( "--continue do FOR--" );
                continue;
            }
            System.out.println( contador );
        }
    
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");
        contador = 0;
        while ( contador < 15 )
        {
            contador++;
            if ( contador > 6  )
            {
                System.out.println( "--continue do WHILE-- " + contador );
                if ( contador < 12 )
                    continue;
                else
                    break;
            }
            System.out.println( contador );
        }

        System.out.println("");
        System.out.println("-- FOR EACH --");
        System.out.println("");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Josefina", "Creusa", "Mykayhelly");
        for (String name : names) 
        {
            System.out.print(name +  " - " );
        }

        int[] impar = { 1, 3, 5, 7, 9 };
        int[] par   = { 2, 4, 6, 8, 10 };
        int total = 0;
        contador = 0;
        // use for-each style for to display and sum the values
        for( int x : impar ) 
        {
            int sum = 0;
            impar[contador] = par[contador];
            System.out.println(" impar original é: " + x + " e o novo valor do ímpar corrente é " + impar[contador]);

            for (int y : par)
                sum += y;
                
            System.out.println("Summation: " + sum);
            contador++;
            total += x;
        }
        System.out.println("Total: " + total);
        
    
        System.out.println("");
        System.out.println("-- Estranho WHILE --");
        System.out.println("");

        int i = 10;
        int j = 20;
        while (++i < --j)
        {
            System.out.println("i - " + i + " - j - " + j);   
        }
        
        System.out.println("");
        System.out.println("-- FOR com variáveis próprias --");
        System.out.println("");
        Boolean done = false;
        for(Integer a=1, b=5; !done; a++, b--) 
        {
            System.out.println("a = " + a + " - " + "b = " + b);
            if ( a == b ) done = true;
        }

        System.out.println("");
        System.out.println("-- Matriz bi dimensional e FOR EACH --");
        System.out.println("");

        int somamatriz = 0;
        int [][] nums = new int [3][5];
        // give nums some values
        for(int var1 = 0; var1 < 3; var1++)
        {
            System.out.println("");
            System.out.println(" var1 = " + var1);
            System.out.println("");
            for(int var2 = 0; var2 < 5; var2++)
            {
                nums[var1][var2] = (var2) * (var1+1);
                System.out.println(" var2 = " + var2 + " - Valor atribuído: " + nums[var1][var2]);
            }
        }   

        System.out.println("");
        System.out.println("-- ---------------------- --");
        System.out.println("");
        int contaLinha = 0;
        for ( int [] linha : nums )
        {
            System.out.println("linha => " + linha [0] + linha [1] + linha [2] + linha [3] + linha[4]);
            for ( int coluna : linha )
            {
                System.out.println(" coluna => " + coluna);
            }
            contaLinha ++;
            System.out.println("");
        }

    }




    private static void a()
    {
        System.out.println("--------------------");
        System.out.println("Entrou no Método A");
        b();
        System.out.println(" ");
        System.out.println("Finalizou o Método A");
    }

    private static void b()
    {
        System.out.println("--------------------");
        System.out.println("Entrou no Método B");

        for ( int i = 1; i<= 3; i++)
        {
            System.out.println(" ");
            System.out.println("iteração => " + i);
            c();
        }

        System.out.println(" ");
        System.out.println("Finalizou o Método B");
    }

    public static void c()
    {
        System.out.println("--------------------");
        System.out.println("Entrou no Método C");
        Thread.dumpStack();
        System.out.println("Finalizou o Método C");
    }
}
