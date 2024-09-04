import java.util.*;
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // To store the result in reverse order
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0; // Initialize carry to 0

        // Traverse both strings from end to start
        while (i >= 0 || j >= 0) {
            int sum = carry; // Start with carry

            // Add the digit from a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--; // Move the pointer left
            }

            // Add the digit from b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--; // Move the pointer left
            }

            // Calculate the new digit and carry
            result.append(sum % 2); // Append the current digit (0 or 1)
            carry = sum / 2; // Calculate the new carry
        }

        // If there's still a carry left, append it
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result since it's built in reverse order
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary solution = new AddBinary();
        String a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();

        String result = solution.addBinary(a, b);

        System.out.println("Result: " + result); 
    }
}
