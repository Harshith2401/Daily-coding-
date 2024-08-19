/*In case the radius parameter is less than 0 it needs to set the radius field value to 0.
Write the following methods (instance methods):
• Method named getRadius without any parameters, it needs to return the
value of radius field.
• Method named getArea without any parameters, it needs to return the
calculated area (radius * radius * PI). For PI use Math.PI constant.
2.Write a class with the name Cylinder that extends Circle class. The class needs one
field (instance variable) with name height of type double.
The class needs to have one constructor with two parameters radius and height both
of type double. It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
• Method named getHeight without any parameters, it needs to return the
value of height field.
• Method named getVolume without any parameters, it needs to return the
calculated volume. To calculate volume multiply the area with height.
TEST EXAMPLE
TEST CODE:
Circle circle = new Circle(3.75); 
System.out.println("circle.radius= " + circle.getRadius()); 
System.out.println("circle.area= " + circle.getArea()); 
Cylinder cylinder = new Cylinder(5.55, 7.25);
System.out.println("cylinder.radius= " + cylinder.getRadius()); 
System.out.println("cylinder.height= " + cylinder.getHeight()); 
System.out.println("cylinder.area= " + cylinder.getArea()); 
System.out.println("cylinder.volume= " + cylinder.getVolume()); 
OUTPUT
circle.radius= 3.75
circle.area= 44.178646691106465
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.76890771219959
cylinder.volume= 701.574580913447*/
// Circle.java
public class cirlce {
    private double radius;

    // Constructor that initializes the radius
    public cirlce(double radius) {
        // If radius is less than 0, set it to 0
        this.radius = radius < 0 ? 0 : radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

// Cylinder.java
public class Cylinder extends cirlce {
    private double height;

    // Constructor that initializes both radius and height
    public Cylinder(double radius, double height) {
        // Call the parent class constructor
        super(radius);
        // If height is less than 0, set it to 0
        this.height = height < 0 ? 0 : height;
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume of the cylinder
    public double getVolume() {
        // Volume = area of the circle * height
        return getArea() * height;
    }
}

// TestShapes.java
public class circle {
    public static void main(String[] args) {
        cirlce circle = new cirlce(3.75); 
        System.out.println("circle.radius= " + circle.getRadius()); 
        System.out.println("circle.area= " + circle.getArea()); 

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius()); 
        System.out.println("cylinder.height= " + cylinder.getHeight()); 
        System.out.println("cylinder.area= " + cylinder.getArea()); 
        System.out.println("cylinder.volume= " + cylinder.getVolume()); 
    }
}
