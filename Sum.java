import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter some numbers: ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
        }
        System.out.println("Sum of number is: " + sum);
    }
}
