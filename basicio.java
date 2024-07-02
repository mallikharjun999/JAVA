import java.util.Scanner;
public class basicio {
    public static void main(String[] args) {
        int a=10;
        int p;
        char c = 'v';
        System.out.println(a);
        System.out.println(c);
        System.out.println("variable a is" +a);
        System.err.println("please enter a number");
        Scanner s= new Scanner(System.in);
        p = s.nextInt();
        System.out.println("you have entered" +p);

    }
    
}
