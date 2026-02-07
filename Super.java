class A{
    public A(){
        super();// default A extends object...so we use super here
        System.out.println("in A");
    }
    public A(int n) {
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int a) {
        // super(a);
        this();
        System.out.println("in B int");
    }
}
public class Super {
    public static void main(String[] args) {
        //B obj= new B();
        B obj= new B(5);
    }
}
// this is used to call constructor of the same class
// super is used to call super class constructors