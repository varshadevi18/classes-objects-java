class Calc{

    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
class Advcalc extends Calc{
    public int power(int a,int b){
        return (int) Math.pow(a,b);
    }
    // child class
    //with this object we can access method from this and parent class
}
class Allone extends Advcalc{
    public int div(int a, int b){
        return a/b;
    }
}
public class Inheritance {
    public static void main(String[] args){
        // Calc obj= new Calc();
        // int sum=obj.add(5,6);
        // int sub=obj.sub(5, 3);
        // Advcalc obj1= new Advcalc(); 
        Allone obj1= new Allone(); // multilevel inheritance
        int sum= obj1.add(5,6);
        int sub=obj1.sub(6,3);
        int p= obj1.power(4, 2);
        int div= obj1.div(10, 5);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(p);
        System.out.println(div);
    }  

}
