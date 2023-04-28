import java.util.Scanner;
public class Sivakrishna_Day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr) ? "Yes,can be made Equal" : "No");
        sc.close();
    }    

    static boolean check(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            
            while(arr[i] % 2 == 0) 
                arr[i] /= 2;

            while(arr[i] % 3 == 0) 
                arr[i] /= 3;    
        }

        for(int i=1;i<n;i++) {
            if(arr[i] != arr[0]) 
                return false;
        }
        return true;
    }

}
