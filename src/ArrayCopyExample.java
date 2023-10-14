public class ArrayCopyExample {
    public static void main(String[] args) {
        // Define the source and destination arrays
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements from the source array to the destination array
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Print the source and destination arrays to verify the copy
        System.out.println("Source Array: ");
        for (int element : sourceArray) {
            System.out.print(element + " ");
        }

        System.out.println("\nDestination Array: ");
        for (int element : destinationArray) {
            System.out.print(element + " ");
        }
    }
}
