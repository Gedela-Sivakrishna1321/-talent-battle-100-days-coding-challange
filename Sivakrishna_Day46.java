import java.util.Scanner;
public class Sivakrishna_Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all elements = "+sum);
    }    
}
