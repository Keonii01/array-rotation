public class ArrayRotator {

    public static void main(String[] args) {
        // Sample array and number of rotations
        int[] arr = {1, 2, 3, 4, 5};
        int d = 4;

        System.out.println("Original Array:");
        printArray(arr);

        // Perform left rotation using temporary array
        arr = leftRotateByTempArray(arr, d);

        System.out.println("Rotated Array:");
        printArray(arr);
    }

    // Function to print array elements (used for testing)
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method for left rotation using temporary array
    public static int[] leftRotateByTempArray(int[] arr, int d) {
        if (d == 0 || arr.length == 1) {
            return arr;
        }

        d = d % arr.length;  // Handling rotations more than array size

        int[] rotatedArray = new int[arr.length];

        // Copy the elements after d positions to the beginning of rotatedArray
        for (int i = 0; i < arr.length - d; i++) {
            rotatedArray[i] = arr[i + d];
        }

        // Copy the first d elements to the end of rotatedArray
        for (int i = 0; i < d; i++) {
            rotatedArray[arr.length - d + i] = arr[i];
        }

        return rotatedArray;
    }
}
