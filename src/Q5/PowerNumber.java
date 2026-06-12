package Q5;

public class PowerNumber {
    public static void main(String[] args) {
        int A = 2;
        int B = 1;
        int C = 4;

        for( int i=1; i<= B; i++){
            C = C * A;
        }
        System.out.println("The Power of this Numbers is  = "+C);
    }
}
