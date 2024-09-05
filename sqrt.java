import java.util.*;
public class sqrt {
    public int mySqrt(int x){
        //to tackle edge case
        if(x==0){
            return 0;
        }
        int low=1, high=x;
        while(low<=high){
            long mid=low+(high-low)/2;
            if((long) mid*mid<=x){
                low=(int) mid+1;
            }else{
                high=(int) mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sqrt s=new sqrt();
        System.out.println("enter the number:");
        int x=sc.nextInt();
        System.out.println("square root of "+x+" is "+s.mySqrt(x));
    }
}
