import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan nilai yang valid.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi di baris " + baris + ", kolom " + kolom + " sudah ditempati oleh " + penonton[baris - 1][kolom - 1] + ".");
                            System.out.println("Silakan masukkan kembali baris dan kolom yang tersedia.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton telah disimpan.");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String output = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, output);
                        }
                    }
                    break;

                    System.out.println("Terima kasih! Program selesai.");

                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-3.");
            }
        }
    }
}
