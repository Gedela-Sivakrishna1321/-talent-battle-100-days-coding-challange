import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Sivakrishna_Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        // i/p the elements
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        // Displaying the set values
        System.out.println(set);

    }
}
