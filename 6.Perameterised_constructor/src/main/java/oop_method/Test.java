package oop_method;

public class Test {
    public static void main(String[] args){
//      Inside object vbalue pass into construstor
        Oop_method teacher = new Oop_method("Irfan","male",838);
  
        teacher.displayInformation();
        
  
//      Inside object vbalue pass into construstor
        Oop_method teacher2 = new Oop_method("Rafiq","Male", 767398);
        teacher2.displayInformation();
        
        Oop_method teacher3 = new Oop_method();
        teacher3.displayInformation();
    }
}
