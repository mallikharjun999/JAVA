import java.util.Scanner; 

public class UserInput {
    public static void main(String[] args) {
        int b;
        System.out.println("Please enter the value:");
        Scanner s = new Scanner(System.in); 
        b = s.nextInt(); 
        System.out.println("The value is " + b); 
    }
}
