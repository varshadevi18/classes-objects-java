class An{
    public void show(){
        System.out.println("in A");
    }
    }

public class Anonymous {
    public static void main(String[] args) {
        An obj= new An()
        {
            public void show(){
        System.out.println("in anonymous class");
    }
        };
        obj.show();
    }
}
