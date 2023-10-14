class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return 2 * (length * width + width * height + height * length);
    }
}

class Manual3 extends Box {
    public Manual3(double length, double width, double height) {
        super(length, width, height);
    }

    // Override the area method in the derived class
    @Override
    public double area() {
        return 4 * (length * width + width * height + height * length);
    }
}

public class Program13 {
    public static void main(String[] args) {
        Box box = new Box(5, 3, 2);
        Manual3 manual3 = new Manual3(5, 3, 2);

        System.out.println("Area of Box: " + box.area());
        System.out.println("Area of Manual3: " + manual3.area());
    }
}
