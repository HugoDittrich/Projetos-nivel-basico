public class MinhaClasse {
    
    // o nome desta primeira classe deve, obrigatoriamente, ser o mesmo do arquivo 
    // inicia-se identificando o primeiro método, que é MAIN, seguindo um padrão
    // sempre é: public static void (não retorna nada) Nome_do_Método (String [] args -> parâmetro especial)

    public static void main (String [] args) {
        // código deste método
        // tudo escrito aqui só exite dentro deste método

        String primeiroNome = "Hugo";
        String ultimoNome = "o gostosão";
        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        
        System.out.println(nomeCompleto + ", o todo poderoso, diz... ");
        System.out.print("Salve salve rapaziada");
    }

    public static String nomeCompleto (String primeiroNome, String ultimoNome) {

        return primeiroNome.concat(" ").concat(ultimoNome);
        
    }



// fim geral
}
