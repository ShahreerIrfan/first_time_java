package oop_method;

 
public class Oop_method {
        String name,gender;
        int phone;
        
        Oop_method(String n,String g,int p){
            name = n;
            gender = g;
            phone = p;
        }
        
        void displayInformation(){
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Phone: "+phone);
        }
}
