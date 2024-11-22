public class survei {
    public static void main(String[] args) {
        int [][] dataS = new int[][]{
            {4, 5, 3, 4, 5, 4},
            {3, 4, 2, 3, 5, 4},
            {5, 4, 4, 5, 3, 4},
            {3, 3, 4, 2, 4, 3},
            {4, 5, 5, 4, 4, 5},
            {2, 3, 3, 4, 2, 3},
            {4, 4, 5, 5, 4, 5},
            {5, 5, 4, 5, 5, 5},
            {3, 2, 3, 4, 3, 2},
            {4, 5, 4, 4, 5, 5},
            
        };

        int jrespondent = dataS.length;
        int jpertanyaan = dataS[0].length;

        System.out.println("====== Rata-rata responden ======\n");

        for(int i = 0; i < jrespondent; i++){
            int skor = 0;
            for(int j = 0; j < jpertanyaan; j++){
                skor += dataS[i][j];
            }
            double rata2 = (double) skor / jpertanyaan;
            System.out.println("Rata-rata responden ke-" + (i+1) + " : " + rata2);

        }
        System.out.println("\n====== Rata-rata pertanyaan ======\n");
        for(int j = 0; j < jpertanyaan; j++){
            int skor = 0;
            for(int i = 0; i < jrespondent; i++){
                skor += dataS[i][j];
            }
            double rata2 = (double) skor / jrespondent;
            System.out.println("rata-rata pertanyaan ke-" + (j+1) + ": " + rata2);
        }
        System.out.println("\n====== rata-rata keseluruhan ======\n");

        int skorfinal = 0;
        for(int i = 0; i < jrespondent; i++){
            for(int j = 0; j < jpertanyaan; j++){
                skorfinal += dataS[i][j];
            }
        }
        double rataseluruh = (double) skorfinal / (jrespondent * jpertanyaan);

        System.out.println("rata-rata keseluruhan : " + rataseluruh);
    }
}
