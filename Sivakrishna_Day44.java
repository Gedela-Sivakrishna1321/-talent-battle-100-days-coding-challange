import java.util.Scanner;
public class Sivakrishna_Day44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        int oddcount=0,evencount=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Number of Even Elements : "+evencount);
        System.out.println("Number of Odd Elements : "+oddcount);

    }
}
