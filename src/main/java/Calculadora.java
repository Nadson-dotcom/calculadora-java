public class Calculadora {
    public double soma(double a, double b) {
        //Implementar a soma
        return a + b;
    }

    public double subtrair (double a, double b) {
        //Implementar a subtração
        return a - b;
    }

    public double multiplicar (double a, double b) {
        //Implementar a multiplicação
        return a * b;
    }

    public double dividir (double a, double b) {
        //Implementar a divisão
        if (b == 0) {
            throw new ArithmeticException("Não é possivel dividir por zero");
        }

        return a / b;

    }
}