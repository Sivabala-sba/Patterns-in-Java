public class Main {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(4);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
        //pattern9(5);
        //pattern17(5);
        //pattern28(5);
        //pattern30(5);
        //pattern31(4);
        //pattern32(4);
    }
    static void pattern1(int n){
        System.out.println("Pattern 1");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        System.out.println("Pattern 2");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("Pattern 3");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("Pattern 4");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        System.out.println("Pattern 5");
        for (int row = 1; row <= 2*n; row++) {
            int TotalCol = row > n ? 2*n - row : row;
            for (int col = 1; col <= TotalCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        System.out.println("Pattern 6");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        System.out.println("Pattern 7");
        for (int row = 1; row <= n; row++) {
            for (int space = 2; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        System.out.println("Pattern 8");
        for (int row = 1; row <= n; row++) {
            int count= row > 1 ? row+row-1 : row;
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= count; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        System.out.println("Pattern 9");
        for (int row = n; row >= 1; row--) {
            int count = row < n ? n-row : 0;
            for (int space = 1; space <= count; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        System.out.println("Pattern 17");
        for (int row = 0; row <= 2*n; row++) {
            int c = row > n ? 2*n - row : row;
            for (int space = 0; space < n-c; space++) {
                System.out.print(" ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        System.out.println("Pattern 28");
        for (int row = 1; row <= 2*n; row++) {
            int TotalCol = row > n ? 2*n - row : row;
            int TotalSpace = n-TotalCol;
            for (int i = 0; i < TotalSpace; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        System.out.println("Pattern 30");
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        System.out.println("Pattern 31");
        int OriginalN = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int IndexValue =OriginalN- Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(IndexValue + " ");
            }
            System.out.println();
        }
    }
    static void pattern32(int n){
        System.out.println("Pattern 32");
        n = 2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int IndexValue = Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(IndexValue);
            }
            System.out.println();
        }
    }
}