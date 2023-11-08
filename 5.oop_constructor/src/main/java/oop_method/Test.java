package oop_method;

public class Test {
    public static void main(String[] args){
//      Perametirised Method
        Oop_method teacher = new Oop_method();
        teacher.setInformation("Irfan","male",838);
        teacher.displayInformation();
        

        
//      For none perametrised Method
        System.out.printf("\n");
        Oop_method teacher2 = new Oop_method();
        teacher2.name = "Rafiq";
        teacher2.gender = "Male";
        teacher2.phone = 767398;
        
        teacher2.displayInformation();
        
//        teacher2.displayInformation();
    }
}
