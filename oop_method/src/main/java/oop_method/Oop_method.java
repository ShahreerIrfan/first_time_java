package oop_method;


public class Oop_method {
        String name,gender;
        int phone;
        
        void setInformation(String s, String t, int ph){
            name = s;
            gender = t;
            phone = ph;
            
        }
        
        void displayInformation(){
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Phone: "+phone);
        }
}
