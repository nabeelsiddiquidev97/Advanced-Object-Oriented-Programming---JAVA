package testexception;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
class UserException extends Exception {

    UserException(String msg) {
        System.out.println(msg);
    }

}

class Box {

    double area(double l, double b, double w) throws UserException {
        double a;
        if (l <= 0 || b <= 0 || w <= 0) {
            throw new UserException("Invalid Box Exception Occured");
        } else {
            a = l * b * w;
            System.out.println("Area:" + a);
            return a;
        }
    }
}



/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
public class TestException {

    public static void main(String[] args) {
        Box ob = new Box();
        try {
            ob.area(0, 0, 0);
        } catch (UserException e) {}
        try {
            ob.area(6, 5, 7);
        } catch (UserException e) {}

    }

}