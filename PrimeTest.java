import java.util.Scanner;
public class PrimeTest {
    public static void main(String[] args) {
        Prime prime = new Prime();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (prime.isPrime(number)){
            System.out.println(number + " is prime");
        }
        else{
            System.out.println(number + " is not prime");
        }
    }
}
