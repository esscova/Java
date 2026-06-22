public class CalculadoraSimples {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b;
        int resto = a % b;

        System.out.println("\n- Calculadora Simples -");
        System.out.println(" Soma               : " + a + " + " + b + " = " + soma);
        System.out.println(" Subtração          : " + a + " - " + b + " = " + subtracao);
        System.out.println(" Multiplicação      : " + a + " x " + b + " = " + multiplicacao);
        System.out.println(" Divisão            : " + a + " / " + b + " = " + divisao);
        System.out.println(" Resto da Divisão   : " + a + " % " + b + " = " + resto);
    }
}