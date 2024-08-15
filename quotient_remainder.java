import java.util.Scanner;


public class quotient_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DIVISOR");
        int a = sc.nextInt();
        System.out.println("ENTER THE DIVIDEND ");
        int b = sc.nextInt();
        System.out.println("reminderv is");
        int remainder = b%a;
        System.out.println(remainder);
        float quotient = b/a;
        System.out.println("quotient is");
        System.out.println(quotient);

    }
}
