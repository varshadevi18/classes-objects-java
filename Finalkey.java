class E{
    final public void show(){
        System.out.println("Hi ");
    }
}
class F extends E{
    // public void show(){
    //     System.out.println("Hello");
    // }
    // final method do not allow overriding
}
public class Finalkey {
    public static void main(String[] args) {
        F obj = new F();
        obj.show();
    }
    
}
