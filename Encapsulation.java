class Human{
    private int age;
    private String name;

    public int getAge(){
        return age=7;
    }
    public String getName(){
        return name="varsha";
    }


}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj= new Human();
        //obj.getAge(5)// we cannot access private variable...so create getmethod in the class of it to return the variable
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
    
}
