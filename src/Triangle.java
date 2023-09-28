public class Triangle extends Shape{
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3){
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        return (this.side1 * this.side2)/2;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return "Side1 = " + this.side1 + "\n" + "Side2 = " + this.side2 + "\n" + "Side3 = " + side3;
    }
}
