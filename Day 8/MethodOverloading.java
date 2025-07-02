class Numbers{
    public void num(int a){
        System.out.println(a);
    }
    public void num(int a, int b){
        System.out.println(a+b);
    }
    public void num(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.num(100);
        n.num(100,200);
        n.num(100,200,300);
    }
}
