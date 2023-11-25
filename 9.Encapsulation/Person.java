

public class Person {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}


class Encap{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("irfan");
        System.out.println(person.getName());
        
    }
}