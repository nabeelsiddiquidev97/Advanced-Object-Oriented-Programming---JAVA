package uniqnonab;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
import java.util.Scanner;
public class UniqNoNab {

    public static void main(String[] args) {
        Scanner nab = new Scanner(System.in);
        int uniq[] = new int[5];

        int count = 0;
        int x = 0;
        int num = 0;

        while (x < uniq.length) {
            System.out.print("\nEnter number: ");
            num = nab.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean digit = false;
                x++;

                for (int i = 0; i < uniq.length; i++) {
                    if (uniq[i] == num)
                        digit = true;
                }

                if (!digit) {
                    uniq[count] = num;
                    count++;
                } else
                    System.out.printf("the number was entered before \n");
            } else
                System.out.println("number must be between 10 and 100");
            System.out.print("The Set Of Unique Numbers: ");
            for (int i = 0; i < x; i++) {
                if (uniq[i] != 0)
                    System.out.print(uniq[i] + " ");
            }
        }
    }
}