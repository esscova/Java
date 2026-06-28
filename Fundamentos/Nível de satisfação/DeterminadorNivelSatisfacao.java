public class DeterminadorNivelSatisfacao {

    public static void main(String[] args) {
        
        int nivel = 3;

        System.out.println("\n--- EXERCICIO: NIVEL DE SATISFAÇÃO ---\n  ");
        System.out.println("Nível Atribuído: " + nivel);
        System.out.print("Classificação: ");

        switch (nivel) {
            case 1 -> System.out.println("Muito insatisfeito.");
            case 2 -> System.out.println("insatisfeito.");
            case 3 -> System.out.println("Neutro.");
            case 4 -> System.out.println("Satisfeito.");
            case 5 -> System.out.println("Muito Satisfeito.");
            default -> System.out.println("Opção inválida (deve estar entre 1 e 5)");
        }

        System.out.println("\n--- ENCERRANDO ---\n");
    }
}
