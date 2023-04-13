public class Mergesort {
    public static void main(String args[]) {
        int arr[] = {240,232,228,194,242,226,241};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }

   static void mergesort(int[] arr, int si, int ei) {
        // Base case
        if(si >= ei) {
            return;
        }

        int mid = si + (ei-si)/2;
        // Divide the array into smaller ones
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    static void merge(int arr[], int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int k=0; // For tracking temp array
        int i=si; // tracking Left sorted array
        int j=mid+1; // Tracking Right sorted array

        while(i<=mid && j<=ei) {
            if(arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++) {
            arr[i] = temp[k];
        }

    }

}