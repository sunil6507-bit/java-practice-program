import java.util.Scanner;
public class swap_two_number {
    public static void main(String[] args) {
        System.out.println("SWAP TWO NUMBER");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int A =sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int B = sc.nextInt();
        System.out.println("before swaping :: A="+A+    "B="+B);
       int s=  A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("SWAP NUMBER");
        System.out.println("after swaping :: A="+A+      "B="+B);


    }
}
