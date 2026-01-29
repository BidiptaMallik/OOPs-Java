package Lab2;

class Rectangle2 {
    double length, breadth;

    Rectangle2() {
        length = breadth = 0;
    }

    Rectangle2(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2();
        r1.area();

        Rectangle2 r2 = new Rectangle2(8, 4);
        r2.area();
    }


}
