public class power_of_number {
    public static void main(String[] args) {
        int num = 5;
        int raise = 2;
        int ans =1;
        for (int i=0;i<raise;i++){
            ans=ans*num;
        }
        System.out.println(ans);
    }
}
//power  : 5^3=125