import java.util.Scanner;
public class Sivakrishna_Day40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :  ");
        String str = sc.next();
        System.out.println("Enter the substring  :");
        String substring = sc.next();
        System.out.println("Enter the NewSubstring : ");
        String Newsub = sc.next();
        String result = str.replace(substring,Newsub);
        System.out.println("Finsl String = "+result);
        sc.close();
    }    
}
