public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){};

    public Rectangle(double w, double h){
        super("Rectangle");
        this.width = w;
        this.height = h;
    }

    public double getArea(){
        return this.height * this.width;
    };

    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    };

    public String toString(){
        return "Width = " + this.width + "\n" + "Height = " + this.height;
    }
}
