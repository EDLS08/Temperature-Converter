import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Fahrenheit para Celsius");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            String input = scanner.nextLine();

            try {
                int operation = Integer.parseInt(input);

                switch (operation) {
                    case 1:
                        System.out.print("Temperatura em Fahrenheit: ");
                        double fahrenheit = Double.parseDouble(scanner.nextLine());
                        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
                        System.out.printf("%.2f °F = %.2f °C%n", fahrenheit, celsius);
                        break;
                    case 2:
                        System.out.print("Temperatura em Celsius: ");
                        double temperatureCelsius = Double.parseDouble(scanner.nextLine());
                        double temperatureFahrenheit = temperatureCelsius * 9.0 / 5.0 + 32;
                        System.out.printf("%.2f °C = %.2f °F%n", temperatureCelsius, temperatureFahrenheit);
                        break;
                    case 3:
                        running = false;
                        System.out.println("Encerrando o conversor...");
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        scanner.close();
    }
}
