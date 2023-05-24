public class IterationPascal {

    public static int fact(int num) {
        if(num == 0)
            return 1;
        return num * fact(num - 1);
    }

    public static void printPascalTriangle(int num) {
        for(int i=0;i<num;i++) {
            // Left Spacing
            for(int j=0;j<=num-i;j++) {
                System.out.print(" ");
            }

            // Printing Numbers
            for(int j=0;j<=i;j++) {
                int print = fact(i)/(fact(i-j) * fact(j));
                System.out.print(print+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    
        int n=5;
        printPascalTriangle(n);
        
    }
}
