public class MinMaxArray {
    public static int[] findMinMax(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum
        int max = arr[0]; // Assume the first element is the maximum
        
        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        
        // Return a pair containing min and max
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};
        int[] result = findMinMax(arr);
        
        // Print the result
         System.out.println("Min: " + result[0] + ", Max: " + result[1]);
