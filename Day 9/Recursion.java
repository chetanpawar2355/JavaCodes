import java.util.Scanner;

public class Recursion {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();
        int fac = factorial(a);
        System.out.println("Factorial of " +a+ " is " +fac);
    }
}
