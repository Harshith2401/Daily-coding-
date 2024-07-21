/*Qus 7:- Write a class with the name Wall. The class needs two fields (instance  variables) with name width and height of type double.  
The class needs to have two constructors. The first constructor does not have  any parameters (no-arg constructor). The second constructor has parameters  width and height of type double and it needs to initialize the fields. In case the  width is less than 0 it needs to set the width field value to 0, in case the height  parameter is less than 0 it needs to set the height field value to 0.  
Write the following methods (instance methods): 
•	Method named getWidth without any parameters, it needs to return the  value of width field. 
•	Method named getHeight without any parameters, it needs to return the  value of height field. 
•	Method named setWidth with one parameter of type double, it needs to  set the value of the width field. If the parameter is less than 0 it needs to  set the width field value to 0. 
•	Method named setHeight with one parameter of type double, it needs to  set the value of the height field. If the parameter is less than 0 it needs to  set the height field value to 0. 
•	Method named getArea without any parameters, it needs to return the  area of the wall. 
TEST EXAMPLE  → TEST CODE:  
 Wall wall = new Wall(5,4); 
 System.out.println("area= " + wall.getArea()); wall.setHeight(-1.5); 
 System.out.println("width= " + wall.getWidth()); 
 System.out.println("height= " + wall.getHeight()); 
 System.out.println("area= " + wall.getArea()); OUTPUT:  area= 20.
 */
// Floor class
class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }
}

// Carpet class
class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}

// Calculator class
class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}

// Test example code
public class wall {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // total= 38.5

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // total= 36.45
    }
}
