import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if else Statement
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        if (a<20) {
            System.out.println(a+" is less than 20");
        }
        else if (a==20) {
            System.out.println(a+" is equal to 20");
        }
        else {
            System.out.println(a+" is Greater than 20");
        }

        // Switch Statement
        System.out.println("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the Range from (1-4):\n1. Addition\n2. Subtraction\n3.Multiplication\n4.Division");
        int range = sc.nextInt();
        switch (range){
            case 1 :
            {
                System.out.println(n1 + n2);
                break;
            }
            case 2 :
            {
                System.out.println(n1 - n2);
                break;
            }
            case 3 :
            {
                System.out.println(n1 * n2);
                break;
            }
            case 4 :
            {
                if(n2!=0) {
                    System.out.println(n1 / n2);
                }
                else {
                    System.out.println("0 is Invalid Number");
                    System.out.println("Enter the New_Number of 2: ");
                    int new_n2 = sc.nextInt();
                    System.out.println(n1 / new_n2);
                }
                break;
            }
            default:
            {
                System.out.println("Invalid Operation");
                break;
            }
        }
    }
}