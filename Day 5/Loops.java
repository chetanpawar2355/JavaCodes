import java.util.Scanner;
public class Loops_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while loop
        System.out.println("1. Enter the Number: ");
        int a = sc.nextInt();
        int i = 0;
        while(i<a){
            System.out.print((i+1)*10+"\t");
            i++;
        }

        // do while loop
        System.out.println("\n2. Enter the Number: ");
        int b = sc.nextInt();
        int j = 0;
        do{
            System.out.print((j+1)*10 +"\t");
            j++;
        }while(j<b);

        // for loop
        System.out.println("\n3. Enter the Number: ");
        int c = sc.nextInt();
        for (int k=0; k<c; k++){
            System.out.print((k+1)*10 +"\t");
        }
    }
}
