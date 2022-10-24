import java.util.Scanner;

public class InfiniteSeries {

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        int recursion = factorial(n-1);
        return n * recursion;
    }
    public static double myexp(double x, int n) {
        double result = 0;
        for (int i=0; i<n; i++) {
            result += (Math.pow(x,i)/factorial(i));
        }
        return result;
    }
    public static void check (int x) {
        System.out.println(x);
        System.out.println(myexp(x,20));
        System.out.println(Math.exp(x));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i1 = scanner.nextInt();
            //int i2 = scanner.nextInt();
            //System.out.println(myexp(i1,i2));
            check(i1);
            if (i1 == 0 /*|| i2 == 0*/) {break;}
        }
    }
}
