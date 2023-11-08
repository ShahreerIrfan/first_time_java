
package overloading_construsctor;


public class Teacher {
    String name,gender;
    int phone;
    
    Teacher(){
        System.out.println("No Information");
    }
    
    Teacher(String n,String g){
        name = n;
        gender = g;
    }
    
    Teacher(String n,String g,int p){
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInformatin(){
        System.out.println("name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("phone: "+phone);
    }
}
