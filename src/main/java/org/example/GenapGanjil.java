package org.example;

public class GenapGanjil {

    public static void main(String[] args){

        // 1.Pisahkan genap dan ganjil dari angka 1 s/d 100
        System.out.print("Angka Ganjil dari 1 sampai 100:\n");
        for (int i = 1;i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i + " ");
            }
        }

        System.out.println("Angka Genap dari 1 sampai 100:");
        for (int i =1; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
