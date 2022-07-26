package printasteriknab;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
public class PrintAsterikNab {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Part A");
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Part B");
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Part C");
        for (int c = 0; c < n; c++) {
            for (int i = 1; i < c + 1; i++)

                System.out.print(" ");
            for (int j = n; j > c; j--)

                System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("Part D");
        for (int c = n; c > 0; c--) {
            for (int i = 0; i < c - 1; i++)

                System.out.print(" ");
            for (int j = n; j > c - 1; j--)

                System.out.print("*");
            System.out.println();
        }
    }
}