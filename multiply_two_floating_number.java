import java.util.Scanner;
public class multiply_two_floating_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST FLOAT NUMBER");
        Float a = sc.nextFloat();
        System.out.println("ENTER 2ND FLOAT NUMBER");
        Float b =sc.nextFloat();
        System.out.println("THE MULTIPLY IS : ");
        Float mul = a*b;
        System.out.println(mul);

    }
}
