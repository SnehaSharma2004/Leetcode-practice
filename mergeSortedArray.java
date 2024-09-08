import java.util.Arrays;
import java.util.Scanner;

class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointer for nums1 (last element of the m elements)
        int i = m - 1;

        // Pointer for nums2 (last element of the array)
        int j = n - 1;

        // Pointer for nums1 (where the final number should go, from the last position)
        int k = m + n - 1;

        // Start merging from the end
        while (i >= 0 && j >= 0) {
            // Compare the last elements of nums1 and nums2
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Place nums1's element in the right position
                i--;
            } else {
                nums1[k] = nums2[j]; // Place nums2's element in the right position
                j--;
            }
            k--; // Move the pointer for the merged array
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first array size and its elements
        System.out.print("Enter the number of elements in nums1 (including extra space for merge): ");
        int totalSize = sc.nextInt();
        int[] nums1 = new int[totalSize];

        System.out.println("Enter the first array elements (fill only the first part, rest should be 0): ");
        for (int i = 0; i < totalSize; i++) {
            nums1[i] = sc.nextInt();
        }

        // Read the second array size and its elements
        System.out.print("Enter the number of elements in nums2: ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];

        System.out.println("Enter the second array elements: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Enter the number of elements in the first array (without the trailing zeros)
        System.out.print("Enter the number of actual elements in nums1 (excluding extra space): ");
        int m = sc.nextInt();

        // Create an instance of the solution class
        mergeSortedArray solution = new mergeSortedArray();
        
        // Call the merge method to merge nums2 into nums1
        solution.merge(nums1, m, nums2, n);

        // Output the merged array
        System.out.println("Merged Array: " + Arrays.toString(nums1));

        sc.close();
    }
}
