import java.util.Scanner;
public class Sivakrishna_Day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        int max_len = Integer.MIN_VALUE;
        int result=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            int len = Integer.valueOf(String.valueOf(arr[i]));
            if(ispalin(arr[i]) && len > max_len ) {
                max_len = Math.max(len,max_len);
                result = arr[i];
            }
        }
        System.out.println(result);
        sc.close();
    }

    static boolean ispalin(int num) {
        char ch[] = String.valueOf(num).toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(ch[i] != ch[ch.length-1-i]) {
                return false;
            }
        }
        return true;
    }

  }


