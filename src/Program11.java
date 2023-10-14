public class Program11 {
    public static int minGap(int[] array) {
        // Check if the array has fewer than 2 elements
        if (array.length < 2) {
            return 0;
        }

        int minGap = Integer.MAX_VALUE; // Initialize minGap to a very large value

        for (int i = 1; i < array.length; i++) {
            int gap = array[i] - array[i - 1];
            if (gap < minGap) {
                minGap = gap;
            }
        }

        return minGap;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 12};
        int result = minGap(array);
        System.out.println("The minimum gap is: " + result); // Output: The minimum gap is: 1
    }

}
