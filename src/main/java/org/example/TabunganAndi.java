package org.example;

public class TabunganAndi {

    public static void main(String[] args){
        double saldo = 750000;
        int bulan = 12;

        for (int i = 1; i <= bulan; i++){
            double bunga = saldo * 0.06;
            double tambahan = saldo * 0.03;

            // Maksimal tambahan dari 3% adalah 24.000 (3% dari 800.000)
            if (tambahan > 240000){
                tambahan = 24000;
            }

            saldo += bunga + tambahan;

            System.out.printf("Bulan %d: Saldo = Rp%.2f (Bunga: Rp%.2f, Tambahan: Rp%.2f)%n",
                    i, saldo, bunga, tambahan);
        }

        System.out.printf("%nTotal tabungan Andi setelah 1 tahun: Rp%.2f%n", saldo);
    }
}
