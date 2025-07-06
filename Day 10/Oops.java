import java.util.Scanner;

class GetInfo{
    void string(String name){
        System.out.println(name);
    }
    void integer(int num){
        System.out.println(num);
    }
}

public class Oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String str = sc.nextLine();
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        GetInfo s = new GetInfo();
        s.integer(num);
        s.string(str);
    }
}
