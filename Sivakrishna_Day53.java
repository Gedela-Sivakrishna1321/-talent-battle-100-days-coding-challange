import java.util.ArrayList;
import java.util.Scanner;
public class Sivakrishna_Day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements : ");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxsubarrayProduct(arr);
        System.out.println(result);
        sc.close();
    }   

    static int maxsubarrayProduct(int arr[]) {

        int result = Integer.MIN_VALUE;
        int si = 0,ei=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int maxproduct = 1;
                for(int k=0;k<j;k++) {
                    maxproduct *= arr[k];
                }
                
                result = Math.max(maxproduct,result);
            }
        }
        return result;
    }

}
