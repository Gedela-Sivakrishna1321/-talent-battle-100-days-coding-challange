import java.util.Scanner;
public class Sivakrishna_Day5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(((num%2 == 0) ? "Even" : "Odd"));
        sc.close();
    }
 }
