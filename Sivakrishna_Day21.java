import java.util.Scanner;
public class Sivakrishna_Day21 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int num = sc.nextInt();
    if (num>0) {
    int temp = num,sum=0;
    // Logic
    while(temp>0) {
    sum = sum*10 + temp%10;
    temp /= 10;
    }
    if(sum == num) {
    System.out.println(" Palindrome");
    } else {
    System.out.println("Not a Palindrome");
    }
    } else {
        System.out.println("Invalid Number");
    } 
        sc.close();
}
 }
