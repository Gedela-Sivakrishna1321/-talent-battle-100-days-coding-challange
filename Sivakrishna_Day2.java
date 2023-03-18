import java.util.Scanner;
public class Sivakrishna_Day2 {
    // Program to check entered character is Alphabet or not
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
       char ch = sc.next().charAt(0);
        // checking condition
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122 )) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an Alphabet");
        }
        sc.close();
    }
}
