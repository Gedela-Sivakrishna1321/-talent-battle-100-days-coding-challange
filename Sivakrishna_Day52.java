import java.util.Scanner;
public class Sivakrishna_Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int len = arr.length;
        // Reverse the Array
        for(int i=0;i<=len/2;i++) {
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }

        // Print the Array
        for(int i=0;i<len;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
