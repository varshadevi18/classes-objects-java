class Student{
    int marks;
    String name;
}
public class Arrayobj {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Varsha";
        s1.marks=15;

        Student s2= new Student();
        s2.name="lachu";
        s2.marks=15;

        Student students[]= new Student[2];
        students[0]=s1;
        students[1]=s2;

        for(Student c: students){
            System.out.println(c.name);
        }

        
    }
}
