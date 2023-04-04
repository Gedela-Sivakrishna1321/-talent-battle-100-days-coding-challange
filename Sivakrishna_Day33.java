import java.util.Scanner;
public class Sivakrishna_Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.next();
        boolean ispalin = true;
        int len = str.length();
        for(int i=0;i<=len/2;i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                ispalin = false;
                break;
            }
        }
        // Displaying
        System.out.println((ispalin) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
