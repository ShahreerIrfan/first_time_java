package oop_method;

public class Test {
    public static void main(String[] args){
//      Perametirised Method
        Oop_method teacher = new Oop_method("Irfan","male",838);
  
        teacher.displayInformation();
        
  
//      For none perametrised Method
        System.out.printf("\n");
        Oop_method teacher2 = new Oop_method("Rafiq","Male", 767398);

        teacher2.displayInformation();
        
//        teacher2.displayInformation();
    }
}
