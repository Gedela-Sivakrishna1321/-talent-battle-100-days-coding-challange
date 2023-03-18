import java.util.Scanner;
public class Sivakrishna_Day1 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        // Checking if it's vowel or Consonant
        if ((ch >= 65 && ch <= 90 ) || (ch >= 97 && ch <= 122)) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("Invalid input");
        }

        sc.close();

    } 
}