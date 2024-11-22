import java.util.Scanner;

public class SiakadDynamic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Meminta input jumlah siswa dan jumlah mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = s.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = s.nextInt();

        // Membuat array dinamis sesuai input
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai untuk setiap siswa dan menghitung rata-rata per siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = s.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalPersiswa / jumlahMatkul));
            System.out.println();
        }

        // Menghitung rata-rata nilai per mata kuliah
        System.out.println("\n==================================");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + (totalPerMatkul / jumlahSiswa));
        }

        s.close();
    }
}
