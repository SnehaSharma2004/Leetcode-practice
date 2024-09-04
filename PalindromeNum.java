import java.util.*;
public class PalindromeNum {
    public boolean isPalindrome(int n){
        int rev=0;
        int original=n;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return original==rev;
    }
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        PalindromeNum ip=new PalindromeNum();
        boolean result=ip.isPalindrome(n);
        System.out.println(result);
    }

}
