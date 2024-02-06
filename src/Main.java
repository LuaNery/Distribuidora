import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        int numDias;
        int i;

        System.out.print("Informe o número de dias no mês: ");
        numDias = leitor.nextInt();

        double[] faturamentoDiario = new double[numDias];

        for (i = 0; i < numDias; i++) {
            System.out.print("Informe o faturamento do dia " + (i + 1) + ": ");
            faturamentoDiario[i] = leitor.nextDouble();
        }

        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
        int diasAcimaMedia = calcularDiasAcimaMedia(faturamentoDiario);

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias acima da média: " + diasAcimaMedia);
    }

    public static double calcularMenorFaturamento(double[] faturamentoDiario) {
        double menor = faturamentoDiario[0];

        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] < menor) {
                menor = faturamentoDiario[i];
            }
        }
        return menor;
    }

    public static double calcularMaiorFaturamento(double[] faturamentoDiario) {
        double maior = faturamentoDiario[0];

        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > maior) {
                maior = faturamentoDiario[i];
            }
        }
        return maior;
    }

    public static double calcularMediaMensal(double[] faturamentoDiario) {
        double soma = 0;
        

        for (double faturamento : faturamentoDiario) {
            soma += faturamento;
        }
        return soma / faturamentoDiario.length;
    }

    public static int calcularDiasAcimaMedia(double[] faturamentoDiario) {
        double media = calcularMediaMensal(faturamentoDiario);
        int diasAcimaMedia = 0;


        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > media) {
                diasAcimaMedia++;
            }
        }
        return diasAcimaMedia;
    }
}
