package Lab2;

class CountObjects {
    static int count = 0;

    CountObjects() {
        count++;
    }

    static void display() {
        System.out.println("Number of objects = " + count);
    }

    public static void main(String[] args) {
        CountObjects o1 = new CountObjects();
        CountObjects o2 = new CountObjects();
        CountObjects o3 = new CountObjects();

        CountObjects.display();
    }
}
