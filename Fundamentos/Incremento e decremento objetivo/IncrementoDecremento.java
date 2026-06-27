public class IncrementoDecremento {
    
    public static void main(String[] args){
        int contador = 5;

        System.out.println("\n--- Operadores de Incremento e Decremento ---");
        System.out.println("Valor Inicial: " + contador);

        // incremento 1
        contador++; // 5 + 1 = 6
        System.out.println("Operador [++]: " + contador);

        // decremento 1
        contador--; // 6 - 1 = 5
        System.out.println("Operador [--]: " + contador);

        System.out.println("Valor Final: " + contador + "\n");

    }
}