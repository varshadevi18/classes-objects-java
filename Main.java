class Computer{
    // public void add(){
    //     System.out.println( "Adding..");
    // }
    // public double add1(double a,int b,int c){
    //     return a+b+c;
    // }
    // inorder to accept diff parameters..we are doing method overloading 
    //samefunc with diff parameter
    
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    //we have also define for diff datatype
    public double add(int n1, double n2){
        return n1+n2;
    }
    //double+int= double(so return type shld be double)


}
class Main {
    public static void main(String[] args) {
        Computer obj= new Computer();
    int r= obj.add(5,7,8);
    int r1=obj.add(5,7);
    System.out.println(r);
    System.out.println(r1);
    double ans= obj.add(5, 2.5);
    System.out.println(ans);
    }
}
