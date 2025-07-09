class Smart{
    public void on(){
        System.out.println("On the SmartPhone's Camera");
    }
    public void off(){
        System.out.println("OFF the SmartPhone's Camera");
    }
}

// Method Overriding
class OldPhone extends Smart{
    @Override
    public void on() {
        System.out.println("On the Phone's Camera");
    }

    @Override
    public void off() {
        System.out.println("OFF the Phone's Camera");
    }
}

class ConstructorOver{
    ConstructorOver(int a, int b){
        System.out.println(a+b);
    }
}

class ConstructorOver2 extends ConstructorOver{
    ConstructorOver2(int a, int b) {
        super(a, b);  // super Keyword
        System.out.println(a-b);

    }
}
public class Overriding {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        op.on();
        op.off();

        Smart sp = new Smart();
        sp.on();
        sp.off();

        new ConstructorOver2(10,2);
    }
}
