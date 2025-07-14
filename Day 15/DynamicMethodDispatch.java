class MyPhone{
    public void on(){
        System.out.println("On the Phone");
    }
    public void off1(){
        System.out.println("Off the Phone");
    }
}
class MySmartPhone extends MyPhone{
    @Override
    public void on(){
        System.out.println("On the SmartPhone");
    }
    public void off2(){
        System.out.println("Off the SmartPhone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        MyPhone sp = new MySmartPhone();
        sp.on();
        sp.off1();
    }
}
