import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Type a string please!!");
        String str = input.nextLine();
        String revString = new StringBuilder(str).reverse().toString();
        */
        System.out.println("Type a number please!!");
        int str = input.nextInt();
        String revString = new StringBuilder(String.valueOf(str)).reverse().toString();
        int revNumber = Integer.parseInt(revString);
        //System.out.println(revString);   
        if(str == revNumber){
            System.out.println(str + " is palindrome");
        }    
        else{
            System.out.println(str + " is not palindrome");
        }
    }
}
