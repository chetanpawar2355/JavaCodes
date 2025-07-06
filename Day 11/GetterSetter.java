class Employee{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(10);
        e.setName("Oracle University");
        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
