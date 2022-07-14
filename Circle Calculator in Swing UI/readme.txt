Create Net Beans application and then add a design frame for the application which is given below:
 

Provide actionPerformed handler for the button 
Create a Circle class with a double radius data member and provide methods: double getRadius(),void setRadius(double value), double calculateDiameter(), double calculateCircumference(),double calculateArea(), and void ShowCharacteristics().
Now create a Sphere class inheriting from Circle:
    class Sphere extends  Circle {
    public void ShowCharacteristics() {
Because Sphere is based on Circle, you can access any public member(s) of Circle without qualifying it(them).
