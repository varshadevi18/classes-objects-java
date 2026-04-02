class U{
    public void show1(){
        System.out.println("in A");
    }

}
class T extends U{
    public void show2(){
        System.out.println("in T");
    }
}
public class Upcast {
    public static void main(String[] args) {
        U obj= (U) new T(); // Upcasts U for T obj
        obj.show1();
    }
}
