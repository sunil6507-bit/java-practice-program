public class reverse_a_number {
    public static void main(String[] args) {
        int num = 12345;
        int rev=0;
        while(num!=0){
            int digit = num%10;//to get a digit
            rev = rev * 10+digit;  //formula
            num=num/10;  //to remove a digit

        }
        System.out.println(rev);

    }
}
//5*10=50+4=54*10=540+3=
//rev= rev*10=digit
// 123%10=3;
//234/10=23