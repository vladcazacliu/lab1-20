package lab10;

public class Triangle extends TwoDimensionalShape{
    // constructor
    public Triangle(double length, double width){
        super(length, width);
    }
    // GETTERS

    public double getArea(){
        return 0.5 * super.getWidth() * super.getLength();
    }
    // String representation

    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}
