ackage datenab;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
class date {
    int day;
    int mm;
    int yy;
    String month;
    int dayofyear;

    date(int d, int m, int y) {
        try {
            if ((d > 0) && (d < 32) && (m > 0) && (m < 13) && (y > 1900) && (y < 2099)) {
                day = d;
                mm = m;
                yy = y;
                System.out.println("DD/MM/YY: " + day + "/" + mm + "/" + yy);
            } else if ((d < 1) && (d > 31)) {
                throw new IllegalArgumentException("Days must be between 1 and 31");
            } else if ((m <= 0) && (m >= 13)) {
                throw new IllegalArgumentException("Months must be between 1 and 12");
            } else if ((y <= 1900) && (y >= 2099)) {
                throw new IllegalArgumentException("Years must be between 1900 and 2099");
            }

        } catch (IllegalArgumentException e) {

            System.out.println("Warning! " + e);
        }
    }
    date(String mth, int dd, int year) {
        try {
            if ((dd > 0) && (dd < 32) && (year > 1900) && (year < 2099)) {
                month = mth;
                day = dd;
                yy = year;
                System.out.println("Month Day, Year: " + month + " " + day + ", " + yy);
            } else if ((dd < 1) && (dd > 31)) {
                throw new IllegalArgumentException("Days must be between 1 and 31");
            } else if ((year <= 1900) && (year >= 2099)) {
                throw new IllegalArgumentException("Years must be between 1900 and 2099");
            }
        } catch (IllegalArgumentException e) {

            System.out.println("Warning! " + e);
        }
    }
    date(int doy, int yr) {
        if ((doy > 0) && (doy < 365) && (yr > 1900) && (yr < 2099)) {
            dayofyear = doy;
            yy = yr;

            System.out.println("Day Of The Year, Year: " + dayofyear + "," + yy);
        }
    }
}

public class DateNab {
    public static void main(String[] args) {
        date d1 = new date(31, 11, 2017);
        date d2 = new date("June", 11, 2017);
        date d3 = new date(265, 2019);
    }

}