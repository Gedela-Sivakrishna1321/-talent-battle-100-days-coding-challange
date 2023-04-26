public class Sivakrishna_Day54 {
    public static void main(String[] args) {
       
        int arr1[] = {2,-4,-1,-3};
        int arr2[] = {1,2,3,5};
        
        if(arr1.length < arr2.length) {
            checkDisJoint(arr1, arr2);
        } else {
            checkDisJoint(arr2, arr1);
        }
    }   

    static void checkDisJoint(int arr1[], int arr2[]) {
        int flag = 1;
        for(int i=0; i<arr1.length; i++) {
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.println("Not DisJoint");
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 1) 
            System.out.println("DisJoint");
    }
  
            
    }   

