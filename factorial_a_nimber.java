public class factorial_a_nimber {
    public static void main(String[] args) {
        int num =5;
        int fac = 1;
        for(int i=1; i<=num; i++){
            fac*=i;//fac=fac*i
            System.out.println("the factorial of" +num +" is: " +fac);
        }
    }
}
