import java.util.Scanner;

public class Survei24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];

        for (int i = 0; i < hasilSurvei.length; i++) {
            System.out.println("Masukkan jawaban untuk Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                int nilai;
                do {
                    System.out.print("Masukkan nilai untuk Pertanyaan ke-" + (j + 1) + " (1-5): ");
                    nilai = scanner.nextInt();
                } while (nilai < 1 || nilai > 5);
                hasilSurvei[i][j] = nilai;
            }
        }

        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < hasilSurvei.length; i++) {
            int totalResponden = 0;
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            double rataRataResponden = totalResponden / (double)hasilSurvei[i].length;
            System.out.printf("Rata-rata Responden ke-%d: %.2f%n", (i + 1), rataRataResponden);
        }

        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < hasilSurvei[0].length; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < hasilSurvei.length; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / (double)hasilSurvei.length;
            System.out.printf("Rata-rata Pertanyaan ke-%d: %.2f%n", (j + 1), rataRataPertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < hasilSurvei.length; i++) {
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        
        double rataRataKeseluruhan = totalKeseluruhan / (double)(hasilSurvei.length * hasilSurvei[0].length);
        
        System.out.printf("\nRata-rata Keseluruhan: %.2f%n", rataRataKeseluruhan);

        scanner.close();
    }
}