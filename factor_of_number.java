public class factor_of_number {
    public static void main(String[] args) {
        int number = 60;
        System.out.println("factor of"+number+"are:");
        for(int i =1; i<=number; ++i){
            if (number % i == 0) {
                System.out.println(i+"");
            }
        }
    }
}
