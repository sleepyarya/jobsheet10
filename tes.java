import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int baris, kolom;
        String nama, next, pilih;

        String[][] penonton = new String[4][2];

        while (true) {
            // Menampilkan menu
            System.out.println("======================================");
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan angka : ");
            pilih = s.nextLine();

            // Opsi untuk input data penonton
            if (pilih.equalsIgnoreCase("1")) {
                System.out.println("======================================");
                System.out.print("Masukkan nama : ");
                nama = s.nextLine();

                System.out.print("Masukkan baris (1-4): ");
                baris = s.nextInt();

                System.out.print("Masukkan kolom (1-2): ");
                kolom = s.nextInt();
                s.nextLine(); // Membersihkan buffer

                // Validasi input baris dan kolom
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out
                            .println("Kursi tidak tersedia. Silakan masukkan baris (1-4) dan kolom (1-2) yang valid.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                }
            }
            // Opsi untuk menampilkan daftar penonton
            else if (pilih.equalsIgnoreCase("2")) {
                System.out.println("======================================");
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                }
            }
            // Opsi untuk keluar dari program
            else if (pilih.equalsIgnoreCase("3")) {
                break;
            }
            // Menangani input yang tidak valid
            else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            // Menanyakan apakah ingin melanjutkan input
            System.out.print("Input penonton lainnya? (y/n): ");
            next = s.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        s.close(); // Menutup scanner
    }
}