import java.util.Scanner;
public class Sivakrishna_Day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i][0] = sc.nextInt();
        }
        if(largestPalin(arr) != -1) {
            System.out.println(largestPalin(arr));
        } else {
            System.out.println("No palindrome Numbers ");
        }
        sc.close();
    }

    static int largestPalin(int arr[][]) {
        int max_len = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            char curr[] = String.valueOf(arr[i][0]).toCharArray();
            boolean ispalin = true;
            for(int j=0;j<curr.length;j++) {
                if(curr[j] != curr[curr.length-1-j]) {
                    ispalin = false;
                    break;
                }
            }
            // If number is palin then store it's size
            if(ispalin) {
                arr[i][1] = curr.length;
                max_len = Math.max(arr[i][1],max_len);
            }
        }
        // Now find the maximm length of the palin and return it
        for(int k=0;k<arr.length;k++) {
            if(arr[k][1] == max_len) {
                return arr[k][0];
            }
        }
        return -1;
    }

}
