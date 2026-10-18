import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Calculadora calculadora = new Calculadora();

        int opcao;

        do {
            // Menu
            System.out.println("===========Menu==========");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro valor: ");
                double primeiroValor = scanner.nextDouble();

                System.out.print("Digite o segundo valor: ");
                double segundoValor = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + calculadora.soma(primeiroValor, segundoValor));
                        break;
                    case 2:
                        System.out.println("Resultado: " + calculadora.subtrair(primeiroValor, segundoValor));
                        break;
                    case 3:
                        System.out.println("Resultado: " + calculadora.multiplicar(primeiroValor, segundoValor));
                        break;
                    case 4:
                        try {
                            System.out.println("Resultado: " + calculadora.dividir(primeiroValor, segundoValor));
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        break;
                }
            } else if (opcao == 0) {
                System.out.println("Calculadora encerrada.");
            } else {
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        scanner.close();
    }
}