import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];
        double mediaFinal;

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Cálculo da média final
        mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%dº Bimestre: %.1f\n", i + 1, mediasBimestrais[i]);
            if (i == 1)
                System.out.printf("1º Semestre: %.1f\n----------------------------\n", mediasSemestrais[0]);
            else if (i == 3)
                System.out.printf("2º Semestre: %.1f\n\nMédia Final: %.1f\n", mediasSemestrais[1], mediaFinal);
        }

        scanner.close();
    }
}
