import java.util.Scanner;

public class Primenumbers {
    public static void main(String[] args) {
        System.out.println("Please enter the limit for the prime number series");
        int limit = 0;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();

        for (int i=2;i<limit;i++){
            Boolean isPrime = true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+" is a prime number");
                sum =sum+i;
            }
        }
        System.out.println("Sum of all prime numbers are "+sum);


    }
}
