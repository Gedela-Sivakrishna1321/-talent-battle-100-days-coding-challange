public class Sivakrishna_Day55 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int sum=0;
        for(int i=0;i<arr1.length;i++) {
            sum += arr1[i]*arr2[i];
        }
        System.out.println(sum);
    }    
}
