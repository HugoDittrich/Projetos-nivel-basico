import java.util.*;

public class UsoFor 
{

    public static void main(String[] args) 
    {
        String alunos[] = {"joão", "maria", "josé", "clara", "josefina", "silva"};

        for (int i = 0, j = 1; i < alunos.length ; i++, j++ ) 
        {
            System.out.println("Iteração " + (j) + ": posição no vetor: " + i + " nome na posição: " + alunos[i]);
        }

        System.out.println(" ");
        System.out.println(" ----------------------------------------");
        System.out.println(" ");

        String[][] matrizStrings = new String[alunos.length][2];

        // Atribuindo valores aos elementos
        matrizStrings[0][0] = "Nome 1";
        matrizStrings[0][1] = "Sobrenome 1";
        matrizStrings[1][0] = "Nome 2";
        matrizStrings[1][1] = "Sobrenome 2";
        matrizStrings[2][0] = "Nome 3";
        matrizStrings[2][1] = "Sobrenome 3";
        matrizStrings[3][0] = "Nome 4";
        matrizStrings[3][1] = "Sobrenome 4";

        for (int i = 0; i < alunos.length; i++)
            matrizStrings[i][0] = alunos[i];

        // Acessando e imprimindo elementos
        for (int i = 0; i < matrizStrings.length; i++) 
        {
            for (int j = 0; j < matrizStrings[i].length; j++) 
            {
                System.out.print(" i = " + i + " j = " + j + " >>> " + matrizStrings[i][j] + " ");
                System.out.println();
            }
            System.out.println();
        }
        

        System.out.println();
        System.out.println(" ----------------------------------------");
        System.out.println();

        String categoriaProduto = "Eletrônico";
        double valorCompra = 1200.0;
        
        double desconto = 0.0;
        int variavelTeste = 0;
        
                if (categoriaProduto.equals("Eletrônico")) 
                //* {
                    if (valorCompra < 1000.0) 
                        desconto = 0.1;

                    else 
                        if (valorCompra >= 1000.0 && valorCompra < 2000.0) 
                            { 
                                desconto = 0.15; 
                                variavelTeste = 1; 
                            }
                        else 
                            desconto = 0.2;
                //* } 
                else 
                    if (categoriaProduto.equals("Eletrodoméstico")) 
                    //* {
                        if (valorCompra < 500.0) 
                            desconto = 0.05;
                        else 
                            if (valorCompra >= 500.0 && valorCompra < 1000.0) 
                                desconto = 0.1;
                            else 
                                desconto = 0.15;
                    //* } 
                    else 
                        System.out.println("Categoria inválida!");
        
                if ( desconto > 0 )
                {                    
                    double valorComDesconto = valorCompra * (1 - desconto);
                    System.out.println("Valor da compra: R$" + valorCompra);
                    System.out.println("Desconto aplicado: " + desconto * 100 + "%");
                    System.out.println("Valor com desconto: R$" + valorComDesconto);
                    System.out.println("Variável Teste => " + variavelTeste);
                }
        System.out.println();
        System.out.println(" ----------------------------------------");
        System.out.println();

        scanner.close();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Valor da mesada: ");
        int mesada = scanner.next();


    }
}
