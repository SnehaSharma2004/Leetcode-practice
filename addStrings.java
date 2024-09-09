import java.util.*;
public class addStrings {
    public String solution(String num1, String num2){
        StringBuilder result=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;

        while(i>=0 || j>=0 || carry>0){
            int d1=i>=0?num1.charAt(i)-'0':0;
            int d2=j>=0?num2.charAt(j)-'0':0;

            int sum=d1+d2+carry;

            carry=sum/10;

            result.append(sum % 10);

            i--;
            j--;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        addStrings s = new addStrings();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        String num1 = sc.nextLine();
        
        System.out.print("Enter the second number: ");
        String num2 = sc.nextLine();
        
        String result = s.solution(num1, num2);
        
        System.out.println("Sum: " + result);
}
}
