import java.util.Scanner;
import java.util.Arrays;
public class Sivakrishna_Day71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<arr.length;i++) {
                arr[i] = sc.nextInt();
            }
            int count=0;
           Arrays.sort(arr);
           for(int i=0;i<arr.length;i++) {
            int below=0,above=0;
            for(int j=0;j<arr.length;j++) {
                
                if(arr[j]<=arr[i]) {
                    below++;
                } else {
                    above++;
                }
            }
            
            if(below > above) 
                count++;
           }
           System.out.println(count);
        }
        sc.close();

    }
  
}