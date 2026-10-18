public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Teste da soma:");
        System.out.println(calculadora.soma(10, 5));

        System.out.println("Teste da subtração:");
        System.out.println(calculadora.subtrair(10, 5));

        System.out.println("Teste da multiplicação:");
        System.out.println(calculadora.multiplicar(10, 5));

        System.out.println("Teste da divisão:");
        System.out.println(calculadora.dividir(10, 2));

        System.out.println("Teste da divisão por zero:");

        try {
            System.out.println(calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }

        System.out.println("Testes concluidos!");
    }
}