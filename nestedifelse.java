public class nestedifelse {
    public static void main(String[] args){
        int marks = 180;
        if(marks>=0 && marks<=100);
        {
            if (marks > 75.) {

                System.out.println(" distinction");

            } else if (marks >= 60) {
                System.out.print("first class");
            }
            else if (marks >= 50) {
                System.out.print("second class");
            }
            else if (marks >= 60) {
                System.out.print("pass");

            }
            else{
                System.out.println("fail");
            }
        }
    }
}
