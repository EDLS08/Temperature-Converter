import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        boolean rodando = true;
        Scanner scanner = new Scanner(System.in);

        while (rodando) {
            try {
                System.out.println("\nDigite a operação que deseja: 1-Celsius 2-Farenheit 3-Sair");
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("Converter para Celsius (Digite a temperatura em farenheit):");
                        Double farenheit = scanner.nextDouble();
                        Double resultCelsius = (5.0 / 9.0) * (farenheit - 32);
                        System.out.printf("%.2f Farenheit = %.2f Celsius\n", farenheit, resultCelsius);
                        break;

                    case 2:
                        System.out.println("Converter para Farenheit (Digite a temperatura em Celsius):");
                        Double celsius = scanner.nextDouble();
                        Double resultFarenheit = (celsius * 1.8) + 32;
                        System.out.printf("%.2f Celsius = %.2f Farenheit\n", celsius, resultFarenheit);
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        rodando = false;
                        break;

                    default:
                        throw new IllegalArgumentException("Error: Argumento inválido: " + operation);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERRO] " + e.getMessage());
                System.out.println("Reiniciando o conversor de temperatura...\n");
            }
        }

        scanner.close();
    }
}
