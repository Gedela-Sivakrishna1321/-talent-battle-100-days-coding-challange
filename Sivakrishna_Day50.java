import java.util.Scanner;
public class Sivakrishna_Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        // Find the square of each number and add it to variable sum
        for(int i=0;i<size;i++) {
            sum += arr[i]*arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
