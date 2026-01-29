package Lab3;

import java.util.Scanner;
    class Plastic2D{
        double length,breadth;
        final double Cost=40;

        Plastic2D(double l,double b){
            length=l;
            breadth=b;
        }
        double cost(){
            return length*breadth*Cost;
        }
    }
    class Plastic3D extends Plastic2D {
    double height;
    final double COST3D = 60;

    Plastic3D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double cost3D() {
        return length * breadth * height * COST3D;
    }
}
public class program1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length and breadth of sheet: ");
    double l = sc.nextDouble();
    double b = sc.nextDouble();

    Plastic2D sheet = new Plastic2D(l, b);
    System.out.println("Cost of plastic sheet = Rs " + sheet.cost());

    System.out.print("Enter length, breadth and height of box: ");
    l = sc.nextDouble();
    b = sc.nextDouble();
    double h = sc.nextDouble();

    Plastic3D box = new Plastic3D(l, b, h);
    System.out.println("Cost of plastic box = Rs " + box.cost3D());

    sc.close();
    }
}
