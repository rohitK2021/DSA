package com.dsa.maths;

public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;

        System.out.println(n);
        //boolean[] primes = new boolean[n+1]; //n+1 because arrays index start from 0
        //seive(n, primes);
    }

    private static void seive(int n, boolean[] primes){
        for(int i = 2; i*i <= n; i++){
            if(!primes[i]){
                for(int j = i*2; j <= n; j += i){
                    primes[j] = true;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(!primes[i]){
                System.out.println(i + " ");
            }
        }
    }
}
