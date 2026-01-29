package Lab3;

class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

public class program3 {
    public static void main(String[] args) {

        Apple obj;   // Parent class reference

        obj = new Apple();
        obj.show();

        obj = new Banana();
        obj.show();

        obj = new Cherry();
        obj.show();
    }
}

