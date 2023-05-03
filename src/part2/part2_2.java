package part2;

public class part2_2 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        // Populate array with sorted values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int target = 12;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index " + result);

        }

        // Check the recursive method
        int recursiveResult = recursiveBinarySearch(arr, target, 0, arr.length-1);

        if (recursiveResult == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index " + result);

        }
    }

    public static int binarySearch(int[] a, int search) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == search) {
                return mid;
            } else if (a[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] a, int search, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (a[mid] == search) {
            return mid;

        } else if (a[mid] < search){
            return recursiveBinarySearch(a, search, mid+1, high);

        } else {
            return recursiveBinarySearch(a, search, low, mid-1);
        }
    }

}
