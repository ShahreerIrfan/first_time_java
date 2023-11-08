class C1 {
    public int x = 5;
    protected int y = 45;
    int z =6;
    private int a = 78;

    void math1(){
        System.err.println(x);
        System.err.println(y);
        System.err.println(z);
        System.err.println(a);

        
    }
    
}


public class accessModifier {

    public static void main(String[] args) {
        C1 c = new C1();
        c.math1();

        // Try to print All data from C1 class

        System.out.println("Printing data from C1 class");

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); Can't access this from this class
    }
}