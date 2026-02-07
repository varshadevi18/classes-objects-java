class Human{
    private int age;

    // public Human(){
    //     this.age=15;
    // }
    //default constructor
    public Human(int a){
        this.age=25;
    }
    //parameterised constructor

    public int getAge(){
        return age;
    }
    // public void setAge(int a){
    //     this.age=a;
    // }

}
public class Constructor {
    public static void main(String[] args) {
        //Human obj= new Human();
        Human obj1= new Human(20);
        // obj.setAge(18);
        // System.out.println(obj.getAge());
        System.out.println(obj1.getAge());
        
    }
    
}
