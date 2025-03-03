public class BinarySearchExample {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) return mid;
            if (arr[mid] > key) return binarySearch(arr, left, mid - 1, key);
            return binarySearch(arr, mid + 1, right, key);
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int result = binarySearch(numbers, 0, numbers.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
