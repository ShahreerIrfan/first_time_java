import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number:" );
        number = input.nextInt();
        System.out.print("Number is:"+number);

        char ch;
        System.out.print("Enter a character :");
        ch = input.next().charAt(0);
        if(ch=='a'){
            System.out.print("This is a\n");
        }

        // String name;
        // System.out.print("Enter a name :");
        // name = input.nextLine();
        // System.out.print("Name is "+name);

    }
}