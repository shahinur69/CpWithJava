import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for(int i = 1; i <= number; i++){
            if(i % 2 == 0){
                System.out.println(i + " is Even");
            }
            else{
                System.out.println(i + " is Odd");
            }
        }
    }
}
