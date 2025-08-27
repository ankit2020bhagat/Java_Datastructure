package java_datastructure.opps;

public class JavaEncapsulation {
    private String name ="Ankit";

    public String get(){
        return name;
    }

    public static void main(String[] args) {
        JavaEncapsulation obj = new JavaEncapsulation();
        System.out.println(obj.get());
    }
}
