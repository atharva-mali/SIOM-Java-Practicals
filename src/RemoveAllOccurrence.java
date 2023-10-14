import java.util.Arrays;

public class RemoveAllOccurrence {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 2, 5, 6, 2, 7}; // Example array
        int elementToRemove = 2; // The element to be removed

        int[] newArray = removeElement(originalArray, elementToRemove);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Element to Remove: " + elementToRemove);
        System.out.println("Array after removal: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int elementToRemove) {
        int count = 0; // Count of elements not equal to elementToRemove

        // Count the number of elements not equal to elementToRemove
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                count++;
            }
        }

        int[] newArray = new int[count]; // Create a new array with the correct size
        int newIndex = 0; // Index for the new array

        // Copy elements that are not equal to elementToRemove to the new array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }

        return newArray;
    }
}

