class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    //it has no methods so calls from parent
    //now we do overriding to print B with same show()
    public void show(){
        System.out.println("in B");
    }
    //this gets printed and it overides method of A class

}
public class Overriding{
    public static void main(String[] args) {
        B obj= new B();
        obj.show();  
    }

}