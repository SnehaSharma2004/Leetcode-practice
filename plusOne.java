import java.util.*;
public class plusOne {
    public int[] solution(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++; //increment by 1
                return arr; //will return the array
            }
            arr[i]=0; //incase the last digit is 9
        }
        //edge case: all the elements in the array are '9', therefore we need to create new array with leading 1
        int[] newNumbers=new int[arr.length+1];
        newNumbers[0]=1; //value at index[0] will be 1

        return newNumbers;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for the array size
        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Input the digits
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an object of the class
        plusOne obj = new plusOne();
        
        // Call the solution method
        int[] result = obj.solution(arr);
        
        // Print the result
        System.out.println("Result: " + Arrays.toString(result));

    }
}
