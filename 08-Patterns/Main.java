
public class Main {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(5);
        pattern4(4);
        pattern5(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printend, we need to addd a newline
            System.out.println();
            
        }
        System.out.println();
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printend, we need to addd a newline
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n- row + 1  ; col++) {
                System.out.print("* ");
            }
            // when one row is printend, we need to addd a newline
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        for(int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2  * n - row : row;
            for (int col = 0; col < totalColsInRow ; col++) {
                 System.out.print("* ");
            }
            System.out.println();
        }  
    }
}
