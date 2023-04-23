import java.util.Scanner;
public class Sivakrishna_Day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the Array
        for(int i=0;i<arr.length;i++) {
        
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing the array
        for(int k = 0;k<size;k++) {
            System.out.print(arr[k] +" ");
        }
        sc.close();

    }    
}
