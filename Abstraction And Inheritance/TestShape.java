package testshape;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
abstract class Shape{
    int length;
    int breadth;
   
   abstract double printArea(double l,double b); 
}

class Rectangle extends Shape{
   
     double printArea(double l,double b){
        double a=l*b;
        return a;
}   
}

class Triangle extends Shape{
    
    double printArea(double l,double b){
        double a=l*b;
        return a; 
    }
}

class Circle extends Shape{
    
    double printArea(double l,double b){ 
        double a=l*b;
        return a; 
    }    
}

public class TestShape {

    public static void main(String[] args) {
       Rectangle r=new Rectangle();
       Triangle t=new Triangle();
       Circle c=new Circle();
       System.out.println("Rectangle Area: "+r.printArea(5, 6));
       System.out.println("Triangle Area:"+t.printArea(8, 2));
       System.out.println("Circle Area:"+c.printArea(6, 6));
       
    } 
}
