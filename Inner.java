class V{
    static class M{
        public void show(){
        System.out.println("inner class");
    }
    }
}
public class Inner {
    public static void main(String[] args) {
        V.M obj= new V.M();// works for static inner class
        // v.m obj1= new obj.m;
        obj.show();
    }
}
