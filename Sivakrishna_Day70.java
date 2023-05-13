import java.util.Scanner;
public class Sivakrishna_Day70 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for(int i=0;i<arr.length;i++) {
        arr[i] = sc.nextInt();
    }        
    int temp = arr[N-1];
    for(int i = arr.length-1;i>=1;i--) {
        arr[i] = arr[i-1];
    }
    arr[0] = temp;
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
}
