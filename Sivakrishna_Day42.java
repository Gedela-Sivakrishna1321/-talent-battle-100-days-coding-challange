import java.util.Scanner;
public class Sivakrishna_Day42 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array1 : ");
    int size1 = sc.nextInt();
    System.out.print("Enter the size of Array2 : ");
    int size2 = sc.nextInt();
    int arr1[] = new int[size1];
    int arr2[] = new int[size2];
    System.out.println("Enter arr1 elements : ");
    for(int i=0;i<arr1.length;i++) {
        arr1[i] = sc.nextInt();
    }
    System.out.println("Enter arr2 elements : ");
    for(int i=0;i<arr2.length;i++) {
        arr2[i] = sc.nextInt();
    }
    if(Isequal(arr1,arr2)) {
        System.out.println("Equal ");
    } else {
        System.out.println("Not Equal");
    }
    // sc.close();
  }  

 static boolean Isequal(int[] arr1,int[] arr2) {
  if(arr1.length != arr2.length) {
    return false;
  }
    for(int i=0;i<arr1.length;i++) {
        if(arr1[i] != arr2[i]) 
            return false;
    }
    return true;
  }

}
