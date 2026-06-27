public class OperadoresAtribuicaoJava {

    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println("\n--- Exercicio com Operadores de Atribuição ---");
        System.out.println("Valor Inicial: " + numero);

        numero += 3; // 5 + 3 = 8
        System.out.println("Atribuindo [+= 3]: " + numero); 
        
        numero -= 2; // 8 - 2 = 6
        System.out.println("Atribuindo [-= 2]: " + numero); 
        
        numero *= 4; // 6 x 4 = 24
        System.out.println("Atribuindo [*= 4]: " + numero); 
        
        numero /= 2; // 24 / 2 = 12
        System.out.println("Atribuindo [/= 2]: " + numero); 

        System.out.println("Valor Final: " + numero);
        System.out.println("\n-----------------" );
        
    }
}