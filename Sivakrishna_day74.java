import java.util.Scanner;
public class Sivakrishna_day74 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- >0) {
        int B = sc.nextInt();
        int L = sc.nextInt();
        int TotalArea = L*B;
        int No_Of_cells = L/2 * B/2;
        if(No_Of_cells*4 == TotalArea) {
            System.out.println(0);
        } else {
            System.out.println(TotalArea - (No_Of_cells*4));
        }
    }      
    sc.close();  
    }
}
