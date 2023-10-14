public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        // Create an instance of the NumberHolder class
        NumberHolder nh = new NumberHolder();

        // Initialize member variables
        nh.anInt = 42;
        nh.aFloat = 3.14f;

        // Display the values of member variables
        System.out.println("anInt: " + nh.anInt);
        System.out.println("aFloat: " + nh.aFloat);
    }
}
