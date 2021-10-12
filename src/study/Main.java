package study;

import java.util.Scanner;

public class Main {
    static double exp(double a, long n){
        if(n == 1){
            return a;
        } else if(n % 2 == 0){
            return exp((a*a),(n/2));
        } else {
            return a*exp(a, (n-1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        long n = scan.nextLong();
        System.out.println(exp(a,n));
    }
}