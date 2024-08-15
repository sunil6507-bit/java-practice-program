import java.util.Scanner;
public class vovel_or_consonant {

    public static void main(String[] args) {
        System.out.println("ENTER A CHARCTER");
        Scanner r = new Scanner(System.in);
        char ch;
         ch= r.next().charAt(0);

        if (ch  == 'a' ||  ch == 'e' || ch =='i'|| ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' ||
                ch=='O' || ch=='U' ){
            System.out.println("IT IS VOWEL");

        }
        else{
            System.out.println("IT IS CONSONANT");
        }


    }
}
