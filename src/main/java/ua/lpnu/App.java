package ua.lpnu;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter e: ");
        double e = scanner.nextDouble();
        double etalon = Math.sin(x);
        double result = teylor(x, etalon, e);
        System.out.println("Result: " + result);
    }

    static double factorial(int n)
    {
        double res = 1.0;
        int i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    static double teylor(double x, double res, double e) {
        double sum = 0;
        int i = 0;
        while(Math.abs(res - sum) >= e) {
            sum += p(x, i);
            i++;
        }
        System.out.println("Iterations number: " + (i-1));
        System.out.println("Error: " + Math.abs(res - sum));
        return sum;
    }

    static double p(double x, int n) {
        return Math.pow(-1, n) * (Math.pow(x, 2*n+1)/factorial(2*n+1));
    }

    static double err(double x, int n) {
        double rn = Math.pow(x, 2*n-1)/factorial(n);
        return Math.abs(rn);
    }
}
