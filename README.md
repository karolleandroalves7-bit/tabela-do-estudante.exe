public class Main {
    public static void main(String[] args) {
        // Em vez de ler do teclado, vamos simular as notas:
        double[] notas = {6, 5, 7, 5, 8, 7, 8, 5};
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];
        double mediaFinal;

        // Cálculo das médias bimestrais
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Média final
        mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Exibir resultados
        System.out.println("=== RESULTADOS ===");
        System.out.printf("1º Bimestre: %.1f%n", mediasBimestrais[0]);
        System.out.printf("2º Bimestre: %.1f%n", mediasBimestrais[1]);
        System.out.printf("1º Semestre: %.1f%n", mediasSemestrais[0]);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f%n", mediasBimestrais[2]);
        System.out.printf("4º Bimestre: %.1f%n", mediasBimestrais[3]);
        System.out.printf("2º Semestre: %.1f%n", mediasSemestrais[1]);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);
    }
}
