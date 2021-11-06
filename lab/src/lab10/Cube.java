package lab10;

public class Cube extends ThreeDimensionalShape{
    // constructor
    public Cube(double length){
        super(length);
    }
    // GETTERS

    public double getArea(){
        return 6 * Math.pow(super.getLength(), 2);
    }

    public double getVolume(){
        return Math.pow(super.getLength(), 3);
    }
    // String representation of object

    public String toString(){
        return String.format("%s: %.2f\n%s:%.2f\n",
                "Area", getArea(), "Volume", getVolume());
    }
}
