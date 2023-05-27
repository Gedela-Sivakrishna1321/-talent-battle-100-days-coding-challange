import java.util.Scanner;
import java.util.Arrays;
public class Sivakrishna_Day77 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- >0) {
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // The difference b/w Last and First element is more and then multiply with last second element
        long max = (long)(arr[N-1]-arr[0])*arr[N-2];
        System.out.println(max);
        
    }       
    sc.close(); 
    }
}
