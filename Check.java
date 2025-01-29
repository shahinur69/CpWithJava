import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a valid please !! ");
        char ch = input.nextLine().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is a character");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println(ch + " is a number");
        }
        else{
            System.out.println(ch + " is an another symbol");
        }
    }
}
