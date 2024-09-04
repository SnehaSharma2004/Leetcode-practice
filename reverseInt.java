import java.util.*;
public class reverseInt {
    public int reverse(int x){
        int rev=0;
        while(x!=0){
            int pop=x%10; //extracts last didgit
            x=x/10; 
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && pop>7)){
                return 0; //condition to check overflow
            }
            if(rev<Integer.MIN_VALUE || (rev==Integer.MIN_VALUE/10 && pop<-8)){
                return 0; //condition to check underflow
            }
            rev=rev*10+pop;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        reverseInt r=new reverseInt();
        int result=r.reverse(x);
        System.out.println("reversed number: "+result);
    }
}
