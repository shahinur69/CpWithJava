import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter some numbers: ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i + " is divisor");
            }
            else{
                System.out.println(i + " is not divisor");
            }
        }
    }
}
