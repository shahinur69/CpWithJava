import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Enter some numbers: ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Original array: ");
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        System.out.println("Reversed array: ");
        for(int i = n - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
