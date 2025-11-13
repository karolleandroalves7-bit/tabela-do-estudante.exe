public class Main {
    public static void main(String[] args) {
        // Valor fixo de temperatura em Celsius
        double celsius = 70.0;  // <-- aqui você define o valor

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibição dos resultados
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
    }
}