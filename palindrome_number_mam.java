import java.util.Scanner;
public class palindrome_number_mam {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        long num = sc.nextLong();
        long rev=0;
        long org = num;
        while(num!=0){
            long digit = num%10;//to get a digit
            rev = rev * 10+digit;  //formula
            num=num/10;  //to remove a digit

        }
        if(org==rev){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }

    }
}
