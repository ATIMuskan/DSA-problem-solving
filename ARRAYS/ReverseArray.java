public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        
        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 5 6 2 3 4 1
    }
}
