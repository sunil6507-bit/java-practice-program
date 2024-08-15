import java.util.Scanner;
public class lopsandcondition_practices

{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    /**    //Q1 leap year
        int a;
     System.out.println("ENTER ANY YEAR");
        a = sc.nextInt();
        if(a%100==0 && a%400==0 || a%100==0 && a%4==0){
            System.out.println("leap year");

        }
        else {
            System.out.println(" not leap year");
        }
*/

       /** //Q2 number id positive or negative
        System.out.println("ENTER A NUMBER");
        int a= sc.nextInt();
        if(a>0){
            System.out.println(" number is positive");
        }
        else if(a<0){
            System.out.println(" number is negative");
        }
        else {
            System.out.println( "number is zero" );
        }
**/









/**     //  Q3 charcter alphabet or not
        System.out.println("enter a number");
        char a = sc.next().charAt(0);
        if(a>'a'&& a<'z'||a<'A' &&a>'Z'){
            System.out.println("this is a alphabet");
        }
        else{
            System.out.println("this is not a alphabet");
        }

**/

/** //Q4 sum of natural number



        int sum = 0,i,n;
        System.out.println("enter the no of natural number");
        n= sc.nextInt();
        for(i= 1; i<=n; i++);
        sum=sum+i;
        System.out.println(sum);**/



   /**     //Q5 factorial
        System.out.println(" enter a number");
        int i = 1;

        int fac = 1;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        while(i<=n){
            fac=fac*i;
            i++;}
        System.out.println(fac);
    **/


  /** //Q6 multiplication table
        System.out.println("enter a number");
        int n= sc.nextInt();
        System.out.println("table is:");
                for(int i=1;i<=10;i++){

                    System.out.println(+n+"x"+i+"="+n*i);
        }**/




   /** //Q7 fabonic series

         int d,c;
         int a =0;
         int b = 1;


        System.out.println("enter the number of terms");
       // Scanner sc = new Scanner(System.in);
         d =sc.nextInt();

         System.out.println("the series is");
        System.out.print (+a+ ""+b);


         for (int i=1; i<=d-2;i++ ){


         c=a+b;
         a=b;
         b=c;

         System.out.print( c+"");
         }
    **/



     /** //Q8
 //gcd=gretest comman divider /hcf
        System.out.println("ENTER TWO NUMBER");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        int gcd=1;
        for(i=1; i<=a && i<= b;i++){
            if(a%i==0 && b%i==0)
            { gcd=i;
        }}
            System.out.println("gcd = " +gcd);}
      **/



     //Q9 lcm

/**System.out.println("enter two number");
        int a=  sc.nextInt();
        int b = sc.nextInt();   // hcf*lcm=a*b
        int t;

        int i;
        for(i=1;i>=a && i>=b;i++){
            if(i%a == 0  && i%b == 0){
                t=i;
            }}
        System.out.println(t);**/







      /** //  Q10 alpbhabet

         char c;
         for(c='A';  c<='Z'; c++){
         System.out.println(c);
         }**/







/** //  Q11 count number of digits of in an integer
        System.out.println("enter a number");
        long s = sc.nextLong();

        int count=0;
       while(s!=0) {
           s = s / 10;
           count++;
       }


        System.out.println(
                "no of digits = " +count);
**/




/** // Q12 reverse number
        System.out.println("enter a number");
       long rev=0;
       long b;
        long a= sc.nextLong();
        while(a!=0){
            b = a %10;
            rev= rev*10+b;
            a=a/10;
        }
        System.out.println(rev); **/


         /** //Q13 power of number
        System.out.println("enter the number");
        int a= sc.nextInt();
        System.out.println("enter the power");
         int b= sc.nextInt();
         int power = b;
         int number  = a;
         int ans =1;
         for (int i=1;i<=power;i++
         ){
             ans*=number;
         }
        System.out.println("the number of power is");
        System.out.println(ans);





**/
         /** //Q14 palindrome
        System.out.println("enter a number");
        long a= sc.nextLong();
        long rev =0;

         long org=a;
        while(a!=0) {
            long b = a % 10;

            rev = rev * 10 + b;
            a = a / 10;
        }


if (org==rev){
    System.out.println(" the number is palindrom");
}
else {
    System.out.println(" the number is not palindrom");
}
*/


      /**   //Q15 prime number
        System.out.println("enter a number");
int a= sc.nextInt();
for (int i=2;i<a;i++)


    if( a%i !=0){
        System.out.println("number is prime");
    }
    else {
        System.out.println("number is not prime");
    }

**/





 /**       //Q17 armstrong number
       System.out.println("enter a number");
        int a= sc.nextInt();
        int temp =a;
        int sum=0;
        int digit;
        while (temp != 0) {
          digit = temp % 10;
          sum = sum + digit * digit * digit;
          temp=temp/10;


      }
      if ( a==sum){
          System.out.println("number is armstrong");
      }
      else{
          System.out.println(" number is not armstrong");
      }
**/



/**  //Q19 factor of number
        System.out.println("enter a number");
int a= sc.nextInt();
int b;
        System.out.println("factor of " +a);
for(int i=1;  i<a; i++){

 if(a%i==0)  {
     System.out.println(i);
 }
}
**/



  /**     //Q20 calculator withv help of switch case
        System.out.println("enter the numbers");
        int c;
         int a= sc.nextInt();
         int b=sc.nextInt();
         switch (a){
             case 1 :
                 System.out.println("adding two number");
                 c=a+b;
                 System.out.println(c);
                 break;
             case 2:
                 System.out.println("subtraction  two number");
                 c=a-b;
                 System.out.println(c);
                 break;
             case 3:
                 System.out.println("multiplyingtwo number");
                 c=a*b;
                 System.out.println(c);
                 break;
             case 4:
                 System.out.println("dividion two number");
                 c=a+b;
                 System.out.println(c);
                 break;



         }**/

    /**    //Q23 pyramid
        System.out.println("enter the number od raw");
        int a=sc.nextInt();
       // System.out.println("enter the number of colum");
       // int b= sc.nextInt();
        for (int i=1;i<=a;i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
        **/



            //   *
            //   * *
        //       * * *
             //  * * * *


/**
        int a=sc.nextInt();
        for (int i=1;i<=a;i++){
            for (int j = 3 ;j>=i;j--){

            }
        }
**/



    }
}













