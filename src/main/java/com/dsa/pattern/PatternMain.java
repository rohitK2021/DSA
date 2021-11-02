package com.dsa.pattern;

public class PatternMain {

    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        pattern5(5);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int column = n; column >= row; column--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){

    }

}
