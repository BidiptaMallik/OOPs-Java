package Lab3;
import java.util.Scanner;

    class Plate {
        double length, width;

        Plate(double length, double width) {
            this.length = length;
            this.width = width;
            System.out.println("Plate Constructor Called");
            System.out.println("Length: " + length);
            System.out.println("Width : " + width);
        }
    }


    class Box extends Plate {
        double height;

        Box(double length, double width, double height) {
            super(length, width); // calling Plate constructor
            this.height = height;
            System.out.println("Box Constructor Called");
            System.out.println("Height: " + height);
        }
    }


    class WoodBox extends Box {
        double thickness;

        WoodBox(double length, double width, double height, double thickness) {
            super(length, width, height);
            this.thickness = thickness;
            System.out.println("WoodBox Constructor Called");
            System.out.println("Thickness: " + thickness);
        }
    }


    public class program2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the dimensions:");
            System.out.print("Length: ");
            double length = sc.nextDouble();

            System.out.print("Width: ");
            double width=sc.nextDouble();


            System.out.print("Height: ");
            double height = sc.nextDouble();

            System.out.print("Thickness: ");
            double thickness = sc.nextDouble();


            WoodBox wb = new WoodBox(length, width, height, thickness);

            sc.close();
        }
    }


