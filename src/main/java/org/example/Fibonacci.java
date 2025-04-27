package org.example;

public class Fibonacci {

    public static void main(String[] args){
        int n = 10; // Jumlah bilangan yang ingin ditampilkan
        int a = 0, b = 1;

        System.out.println("Bilangan Fibonacci sebanyak 10 kali:");
        for (int i = 1; i <= n; i++){
            System.out.println(i + " ");
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
