import java.util.*;
public class happyNumber {
    public boolean solution(int n){
        //create a HashSet to store and search the stored digits
        Set<Integer> usedIntegers=new HashSet<>();

        while(true){

            //find the sum of squares
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n % 2,2.0);
                // int digit=n%10;
                // sum+=digit*digit;
                n=n/10;
            }
            //check if n is equal to 1
            if(sum==1){
                return true;
            }else{
                n=sum;
                if(usedIntegers.contains(n)){
                    return false;
                }else{
                    usedIntegers.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        happyNumber happy = new happyNumber();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(happy.solution(n));
    }
}
