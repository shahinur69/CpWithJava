import java.util.Scanner;

public class MultificationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number please !! ");
        int n = input.nextInt();
        System.out.println("Multification table: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
