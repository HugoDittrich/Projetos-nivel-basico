public class MinhaClasse {
    
    // o nome desta primeira classe deve, obrigatoriamente, ser o mesmo do arquivo 
    // inicia-se identificando o primeiro método, que é MAIN, seguindo um padrão
    // sempre é: public static void (não retorna nada) Nome_do_Método (String [] args -> parâmetro especial)

    public static void main (String [] args) {
        // código deste método
        // tudo escrito aqui só exite dentro deste método


        System.out.println(" ");
        System.out.println(" ");
        

        System.out.println(" ");
        System.out.println("- - - - - - - - - - ");
        System.out.println(" ");

        // Criando uma nova instância da classe Algarismo
        Algarismo numeroUm   = new Algarismo(1);
        Algarismo numeroDois = new Algarismo(1);

        if (numeroUm == numeroDois)
        {
            System.out.print("Os conteúdos das instâncias NUMÉRICAS são os mesmos");
        }
        else
        {
            System.out.print("Os conteúdos das instâncias NUMÉRICAS são DIFERENTES");
        }

    }
    

    public class Algarismo {

        private int valor; // Atributo para armazenar o valor do algarismo
    
        // Construtor para inicializar o valor do algarismo
        public Algarismo(int valor) {
            this.valor = valor;
        }
    
        // Método para obter o valor do algarismo
        public int getValor() {
        
            return valor;
        }
    
    }



// fim geral
}