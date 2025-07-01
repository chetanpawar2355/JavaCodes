import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // One Dimensional Array
        System.out.print("Enter the Number: ");
        int user = sc.nextInt();
        int [] arr = new int[user];
        for(int i=0; i<user; i++){
            System.out.print("Enter Number " +(i+1)+ ": ");
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<user;i++){
            System.out.print(arr[i]+"\t");
        }

        // Two Or Multi Dimensional Array
        System.out.print("\n\nEnter the Number of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int col = sc.nextInt();
        int [][] rc = new int[row][col];
        for (int n=0; n<row; n++){
            for (int m=0; m<col; m++){
                System.out.print("Enter the Number: ");
                rc[n][m] = sc.nextInt();
            }
        }
        for (int n=0; n<row; n++){
            System.out.println();
            for (int m=0; m<col;m++){
                System.out.print(rc[n][m]+"\t");
            }
        }
    }
}
