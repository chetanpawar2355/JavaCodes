class AO{
    int addition(int a, int b){
        return a+b;
    }
    int subtraction(int a, int b){
        return a-b;
    }
    int multiplication(int a, int b){
        return a*b;
    }
    int division(int a, int b){
        return a/b;
    }
    int modulus(int a, int b){
        return a%b;
    }
}
public class Methods_1 {
    public static void main(String[] args) {
        AO obj = new AO();
        System.out.println("Addition is " +obj.addition(10,20));
        System.out.println("Subtraction is " +obj.subtraction(20,10));
        System.out.println("Multiplication is " +obj.multiplication(10,20));
        System.out.println("Division is " +obj.division(20,10));
        System.out.println("Modulus is " +obj.modulus(20,10));
    }
}
