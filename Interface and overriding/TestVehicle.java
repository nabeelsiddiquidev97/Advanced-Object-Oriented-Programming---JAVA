package testvehicle;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
interface Vehicle {
    void printData();
}

class Car implements Vehicle {
    String manufacturer;
    int year;
    String color;
    String size;

    public Car(String m, int y, String c, String s) {
        manufacturer = m;
        year = y;
        color = c;
        size = s;
    }

    public String toString() {
        String line = "Your Car Details Are:";
        return line + "\nManufaturer: " + manufacturer + "\nYear:" + year + "\nColor: " + color + "\nSize: " + size;
    }

    public void printData() {
        System.out.println(toString());
    }

}
class SUV implements Vehicle {
    String manufacturer;
    int year;
    String color;
    String size;

    public SUV(String m, int y, String c, String s) {
        manufacturer = m;
        year = y;
        color = c;
        size = s;
    }

    public String toString() {
        String line = "\nYour SUV Details Are:";
        return line + "\nManufaturer: " + manufacturer + "\nYear:" + year + "\nColor: " + color + "\nSize: " + size;
    }

    public void printData() {
        System.out.println(toString());
    }

}

class MiniVan implements Vehicle {
    String manufacturer;
    int year;
    String color;
    String size;

    public MiniVan(String m, int y, String c, String s) {
        manufacturer = m;
        year = y;
        color = c;
        size = s;
    }

    public String toString() {
        String line = "\nYour MiniVan Details Are:";
        return line + "\nManufaturer: " + manufacturer + "\nYear:" + year + "\nColor: " + color + "\nSize: " + size;
    }

    public void printData() {
        System.out.println(toString());
    }

}


public class TestVehicle {


    public static void main(String[] args) {
        Car c = new Car("Honda", 2017, "Blue", "small");
        SUV s = new SUV("Toyota", 2017, "Gray", "big");
        MiniVan m = new MiniVan("VolksWagen", 2017, "Red", "bigger");
        c.printData();
        s.printData();
        m.printData();
    }

}