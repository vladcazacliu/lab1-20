package lab10;

public class Circle extends TwoDimensionalShape{
    // constructor
    public Circle(double radius){
        super(radius);
    }
    // GETTERS returneaza valoarea atributului

    public double getArea(){
        return Math.PI * Math.pow(super.getLength(), 2);
    }
    // String representation

    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}
