package com.dsa.maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1; i < n; i++){
            System.out.println(i + " == " + solution1(i) + " == " + solution2(i));

        }
    }

    private static boolean solution1(int n){
        if(n <= 1)
            return false;
        int c = 2;
        while(c < n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    private static boolean solution2(int n) {
        if(n <= 1)
            return false;
        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
