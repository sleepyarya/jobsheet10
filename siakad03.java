import java.util.Scanner;

public class siakad03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nilai[][] = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = s.nextInt();
                totalPersiswa += nilai[i][j];

            }
            System.out.println("Nilai rata-rata : " + totalPersiswa / 3);
        }
        System.out.println("\n==================================");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j= 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];

            }
                System.out.println("mata kuliah "+ (j+1) + ": " + totalPerMatkul/4);
        }

    }
}
