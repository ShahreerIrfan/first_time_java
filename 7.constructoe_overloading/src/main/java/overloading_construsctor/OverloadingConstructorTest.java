
package overloading_construsctor;


public class OverloadingConstructorTest {
    public static void main(String[] args){
        Teacher Teacher1 = new Teacher("Irfan","Male",3783);
        Teacher1.displayInformatin();
        
        System.out.print("\n");
        
        Teacher teacher2 = new Teacher("Irfan","Male");
        teacher2.displayInformatin();
        
        System.out.print("\n");
        
        Teacher teacher3 = new Teacher();
        
    }
}
