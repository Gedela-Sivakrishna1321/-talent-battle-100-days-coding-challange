import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Sivakrishna_Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        System.out.println("Enter arr1 elements : ");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter arr2 elements : ");
        for(int i=0;i<size;i++) {
            arr2[i] = sc.nextInt();
        }
        // Sort arr1 in Ascending order
        Arrays.sort(arr1);
        // sort arr2 in Ascending order
        Arrays.sort(arr2);

        int product = 0;
        for(int i=0;i<size;i++) {
            product += arr1[i]*arr2[size-1-i];
        }

        System.out.println(product);
        sc.close();

    }
}