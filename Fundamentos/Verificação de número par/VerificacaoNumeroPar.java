public class VerificacaoNumeroPar {

    public static void main(String[] args) {
        int numero = 10;

        System.out.println("\n--- EXERCICIO: VERIFICADOR DE NÚMERO PAR ---\n");
        System.out.println("Número informado: " + numero);
        System.out.println("Resultado da verificação:");

        if (numero % 2 == 0){
            System.out.println("Este número é par.");
        }else{
            System.out.println("Este número é ímpar.");
        }

        System.out.println("\n--- Encerrando ---\n");
    }
}