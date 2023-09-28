import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Circle c = new Circle(4);
        System.out.println(c);

        Triangle t = new Triangle(5, 5, 5);
        System.out.println(t);

        Rectangle r = new Rectangle(5, 8);
        System.out.println(r);

        Square s = new Square(5);
        System.out.println(s);


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please write which shape do you want to calculate" + "\n" + "Rectangle -> R" + "\n" + "Triangle -> Tr" + "\n" + "Circle -> C" + "\n" + "Square -> S");
            String userChoose = sc.nextLine();
            
            if ( userChoose.equals("R") ){
                System.out.println("Enter a width of Rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Enter a height of Rectangle: ");
                double height = sc.nextDouble();
                Rectangle r1 = new Rectangle(width, height);
                System.out.println("The area of rectangle with the width: " + width + " and the height: " + height + " is -> " + r1.getArea());
                System.out.println("The periemter of rectangle with the width: " + width + " and the height: " + height + " is -> " + r1.getPerimeter());
                break;
            }
            else if ( userChoose.equals("Tr") ){
                System.out.println("Enter a length of side1 of Triangle: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter a length of side2 of Triangle: ");
                double side2 = sc.nextDouble();
                System.out.println("Enter a length of side3 of Triangle: ");
                double side3 = sc.nextDouble();
                Triangle t1 = new Triangle(side1, side2, side3);
                System.out.println("The area of triangle with the side1: " + side1 + ", the side2: " + side2 + " and the side3: " + side3 + " is -> " + t1.getArea());
                System.out.println("The periemter of triangle with the side1: " + side1 + ", the side2: " + side2 + " and the side3: " + side3 + " is -> " + t1.getPerimeter());
                break;
            }
            else if( userChoose.equals("C") ){
                System.out.println("Enter a radius of Circle: ");
                double radius = sc.nextDouble();
                Circle c1 = new Circle(radius);
                System.out.println("The area of circle with the raidus: " + radius + " is -> " + c1.getArea());
                System.out.println("The periemter of circle with the radius: " + radius + " is -> " + c1.getPerimeter());
                break;
            }
            else if ( userChoose.equals("S") ){
                System.out.println("Enter a length of side on Square: ");
                double side = sc.nextDouble();
                Square s1 = new Square(side);
                System.out.println("The area of square with the side: " + side + " is -> " + s1.getArea());
                System.out.println("The periemter of square with the side: " + side + " is -> " + s1.getPerimeter());
                break;
            }
            else{
                System.out.println("Please write it correctly");
            }
        }

    }
}
