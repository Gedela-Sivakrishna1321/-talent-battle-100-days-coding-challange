import java.util.Scanner;
public class Sivakrishna_Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array  : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // Enter the Elements
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println("Maximun Element : "+max);
        System.out.println("Minimum Element :"+min);


    }
}
