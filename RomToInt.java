// import java.util.Map;
// import java.util.HashMap;
import java.util.*;

public class RomToInt {
    public int romanToInt(String s){
        Map<Character, Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //convert input string to character array
        char[] chars=s.toCharArray();
        int result=0;

        int i,j; //global declaration of pointers, so that it can be accessed when j goes out-of-bound
        for(i=0,j=1;j<chars.length;i++,j++){

            //access key-value from the map
            if(map.get(chars[i])>=map.get(chars[j])){
                result+=map.get(chars[i]);
            }else{
                result-=map.get(chars[i]);
            }
        }
        result+=map.get(chars[i]); //to access values if it goes out-of-bound
        return result;
    }
    public static void main(String... args){
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter roman numbers: ");
        s=sc.nextLine();
        RomToInt r=new RomToInt();
        int result=r.romanToInt(s);
        System.out.println("integer value is "+result);
    }
}
