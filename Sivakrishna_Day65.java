import java.util.Scanner;
public class Sivakrishna_Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int arr[][] = new int[N][3];
            int Max_Area = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
                if(arr[i][2] <= B) {
                    Max_Area = Math.max(Max_Area,(arr[i][0]*arr[i][1]));
                }
            }
            if(Max_Area == Integer.MIN_VALUE) {
                System.out.println("No tablet");
            } else {
                System.out.println(Max_Area);
            }
        }
        sc.close();
    }    
}
