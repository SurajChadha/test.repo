//Task 50 sort an array with integer elements and array of string using simple for loop

public class Task50 {
    public static int[] sortArrays(int[] arr) {
        // finding the length of array
        int length = arr.length;
        // sorting using a single loop
        for (int j = 0; j < length - 1; j++) {
            // checking the condition for two
            // simultaneous element of the array
            if (arr[j] > arr[j + 1]) {
                // swaping the elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                // updating the value of j+1
                // so after updating the value of j++
                // in the loop it become 0
                // and the loop begins from start
                j = -1;

            }
        }
        return arr;
    }

    // delaring main method
    public static void main(String[] args) {
        // declaring an integer array of size 11
        int arr[] = { 1, 2, 99, 9, 8,
                7, 6, 0, 5, 4, 3 };
        // printing the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // sorting the array using single loop
        arr = sortArrays(arr);
        // printing the sorted array
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
}