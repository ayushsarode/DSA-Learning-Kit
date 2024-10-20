
public class Main {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(5);
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
}
