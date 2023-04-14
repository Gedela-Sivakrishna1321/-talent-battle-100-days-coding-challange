import java.util.Scanner;
public class Sivakrishna_Day43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        // Now, Check whether the array is even, odd or mixed type
        boolean Iseven = true,Isodd = true;
        for(int i=0;i<arr.length;i++) {
            // Odd Condition
            if(arr[i] % 2 != 0) 
                Iseven = false;

            // Even Condition
            if(arr[i]%2 == 0) 
                Isodd = false;        

        }

        // o/p the Result
        if(Iseven) {
            System.out.println("Even");
        } else if (Isodd) {
            System.out.println("Odd");
        } else {
            System.out.println("Both Even and Odd");
        }
    }
}