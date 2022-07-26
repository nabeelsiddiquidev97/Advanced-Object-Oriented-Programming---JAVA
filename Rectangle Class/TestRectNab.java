package testrectnab;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
class Rectangle {
    float length = 1;
    float width = 1;

    public void setLength(float l) {
        try {
            if ((l > 0.0) && (l < 20.0)) {
                length = l;
            } else if (l <= 0.0 || l >= 20.0) {
                throw new IllegalArgumentException("LENGTH must be between 0.0 and 20.0");
            }
        } catch (IllegalArgumentException e) {

            System.out.println("Warning! " + e);
        }
    }

    float getLength() {
        return length;
    }

    public void setWidth(float w) {
        try {
            if ((w > 0.0) && (w < 20.0)) {
                width = w;
            } else if (width <= 0.0 || width >= 20.0) {
                throw new IllegalArgumentException("WIDTH must be between 0.0 abnd 20.00");
            }
        } catch (IllegalArgumentException e) {

            System.out.println("Warning! " + e);
        }
    }
    float getWidth() {
        return width;
    }

    double calperimeter() {
        double p = 2 * (length + width);
        return p;
    }

    double calarea() {
        double a = length * width;
        return a;
    }

}
public class TestRectNab {


    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("By Default the Perimeter Of Rectangle: " + rect.calperimeter());
        System.out.println("By Default the Area Of Rectangle: " + rect.calarea());
        rect.setLength(21);
        System.out.println("By Default Length Of Rectangle: " + rect.getLength());
        float l = 7;
        rect.setLength(l);
        float w = 8;
        rect.setWidth(w);
        System.out.println("After Setting the Length = " + l + " and Width = " + w + " of Rectangle the Area becomes: " + rect.calarea());
        System.out.println("After Setting the Length = " + l + " and Width = " + w + " of Rectangle the Perimeter becomes: " + rect.calperimeter());
    }
}