package testexception1;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
class UserException extends Exception {

    UserException(String msg) {
        System.out.println(msg);
    }

    protected void showS() {
        System.out.println("Message from TestException1");
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

public class TestException1 {

    public static void main(String[] args) {
        Box ob = new Box();
        try {
            ob.area(0, 0, 0);
        } catch (UserException e) {
            e.showS();
        }
        try {
            ob.area(6, 5, 7);
        } catch (Exception e) {   }
    }
}