class Construct{
    Construct(String name){
        System.out.println(name);
    }
    Construct(String name1, String name2){
        System.out.println(name1);
        System.out.println(name2);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Construct c = new Construct("Chetan", "Amol");
    }
}
