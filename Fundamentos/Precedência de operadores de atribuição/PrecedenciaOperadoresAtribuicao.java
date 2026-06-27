public class PrecedenciaOperadoresAtribuicao {

    public static void main(String[] args) {

        int numero;

        System.out.println("\n--- Exercício: Precedência de Operadores de Atribuição ---");

        // Pré-incremento
        numero = 5;
        System.out.println("\nPré-incremento (++var)");
        System.out.println("Valor inicial: " + numero);
        System.out.println("Resultado da expressão: " + (++numero));
        System.out.println("Valor da variável após a operação: " + numero);

        // Pós-incremento
        numero = 5;
        System.out.println("\nPós-incremento (var++)");
        System.out.println("Valor inicial: " + numero);
        System.out.println("Resultado da expressão: " + (numero++));
        System.out.println("Valor da variável após a operação: " + numero);

        // Pré-decremento
        numero = 5;
        System.out.println("\nPré-decremento (--var)");
        System.out.println("Valor inicial: " + numero);
        System.out.println("Resultado da expressão: " + (--numero));
        System.out.println("Valor da variável após a operação: " + numero);

        // Pós-decremento
        numero = 5;
        System.out.println("\nPós-decremento (var--)");
        System.out.println("Valor inicial: " + numero);
        System.out.println("Resultado da expressão: " + (numero--));
        System.out.println("Valor da variável após a operação: " + numero);

        System.out.println("\n--- Fim do Exercício ---\n");
    }
}