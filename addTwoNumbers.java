import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class addTwoNumbers {
    public ListNode solution(ListNode l1, ListNode l2) {
        //create new ListNode which is intialized to zero
        ListNode result=new ListNode(0); 
        //initialized the pointer
        ListNode ptr=result;

        //initailize carry
        int carry=0;

        //initialize sum
        while(l1!=null || l2!=null){
            int sum=0+carry;
            
            //use number from first list
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next; //move the pointer to next number
            }

            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

           carry=sum/10;
           sum=sum%10;
           ptr.next=new ListNode(sum); //craeted new node of result list
           ptr=ptr.next; //moved pointer to the next node
        }
        //if we have carry remaining at the end, create a new node
        if(carry==1){
            ptr.next=new ListNode(1);
        }
        return result.next;
    }
    public static ListNode createLinkedListFromInput(Scanner sc) {
        System.out.println("Enter the digits of the number in reverse order, separated by spaces:");
        String[] digits = sc.nextLine().split(" ");
        
        ListNode head = new ListNode(Integer.parseInt(digits[0]));
        ListNode current = head;

        for (int i = 1; i < digits.length; i++) {
            current.next = new ListNode(Integer.parseInt(digits[i]));
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits for the first number:");
        ListNode l1 = createLinkedListFromInput(sc);

        System.out.println("Enter the digits for the second number:");
        ListNode l2 = createLinkedListFromInput(sc);

        // Call the solution
        addTwoNumbers solution = new addTwoNumbers();
        ListNode result = solution.solution(l1, l2);

        // Print the result list
        System.out.print("The sum is: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
