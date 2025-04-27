package org.example;

public class BilanganPrima {

    public static void main(String[] args){
        System.out.println("Bilangan prima dari 1 sampai 100:");
        for (int i = 1; i <= 100; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number){
        if(number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
