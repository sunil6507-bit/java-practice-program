import java.util.Scanner;
public class calculatepercentageofmarks {
    public static void main(String[] args){
        System.out.println("Enter The Marks Of All Subjects Out Of 100 marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st subject marks");
        int a =sc.nextInt();
        System.out.println("enter 2nd subject marks");
        int b =sc.nextInt();
        System.out.println("enter 3rd subject marks");
        int c =sc.nextInt();
        System.out.println("enter 4th subject marks");
        int d =sc.nextInt();
        System.out.println("enter 5th subject marks");
        int e =sc.nextInt();
        int sum = a+b+c+d+e;
                System.out.println("sum of all marks");
        System.out.println(sum);
        float percentage = sum/5.0f;
        System.out.println("percentage of student");
        System.out.println(percentage);



    }
}
