class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        this.age= a;
    }
    public void setName(String n){
        this.name=n;
        // name= n;
        //it doesnot know to diff instance variable it assigns only local variable
        //so use this keyword as it refer to current obj and change ins var
        //or else it will print only 0
    }


}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj= new Human();
        obj.setAge(18);
        obj.setName("Varsha");
        //obj.getAge(5)// we cannot access private variable...so create getmethod in the class of it to return the variable
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        // System.out.println(obj.setAge(5));
        // System.out.println(obj.setName("Varsha"));
    }
    
}
