import java.util.*;

/*METHOD 1: ARRAY (using loops) */

// public class twoSum {
//     public int[] twosum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     int arr[] = {i, j};
//                     return arr;
//                 }
//             }
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }
        
//         System.out.print("Enter the target value: ");
//         int target = scanner.nextInt();
        
//         twoSum ts = new twoSum();
//         int[] result = ts.twosum(arr, target);
        
//         if (result != null) {
//             System.out.println("Indices: " + Arrays.toString(result));
//         } else {
//             System.out.println("No two numbers add up to the target.");
//         }
        
//     }
// }



/*METHOD 2: SORTING */

public class twoSum{
    
}

/*METHOD 3: HASH TABLE */

// public class twoSum{
//     public int[] twoSumHashing(int[] nums, int target){
//         Map<Integer, Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int complement=target-nums[i];
//             if(map.containsKey(complement)){
//                 return new int[]{map.get(complement,i)};
//             }
//             map.put(nums[i], i);
//         } 
//         // throw new IllegalException();
//         System.out.println("not two sum solution");
//     }
//     public static void main(String... args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter the target value: ");
//         int target = sc.nextInt();

//         twoSum ts = new twoSum();
//         int[] result = ts.twoSumHashing(arr, target);
//     }
// }