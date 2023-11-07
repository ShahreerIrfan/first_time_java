
package objectOriented;

public class objecter {
    public static void main(String[] args){
        ObjectOriented teacher = new ObjectOriented();
        teacher.name = "Irfan";
        teacher.gender = "male";
        teacher.phone = 423423;
        
        System.out.print(teacher.name+"\n");
        System.out.print(teacher.gender+"\n");
        System.out.print(teacher.phone+"\n");
        
        
        ObjectOriented teacher2 = new ObjectOriented();
        
        teacher2.name = "Helal";
        teacher2.gender = "Male";
        teacher2.phone = 3733;
        
        System.out.print("Teacher 2 name "+teacher2.name+"\n");
        System.out.print("Gender of the teacher"+teacher2.gender+"\n");
        System.out.print("Number: "+teacher2.phone+"\n");
        
        
    }
}
