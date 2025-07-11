public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operator
        int a = 10;
        int b = 6;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));

        // Relational Operator
        System.out.println("< : "+(a<b));
        System.out.println("> : "+(a>b));
        System.out.println("<= : "+(a<=b));
        System.out.println(">= : "+(a>=b));
        System.out.println("== : "+(a==b));

        // Assignment Operator
        int c = 5;
        int d = 3;
        System.out.println("= : "+(c=d));
        int e = 5;
        int f = 3;
        System.out.println("+= : "+(e+=f));

        // Logical Operator
        int g = 30;
        int h = 20;
        System.out.println("Logical OR: "+(g>h || g<h));
        System.out.println("Logical AND: "+(g>h && g<h));
        System.out.println("Logical NOT: "+(!(g<h)));
    }
}