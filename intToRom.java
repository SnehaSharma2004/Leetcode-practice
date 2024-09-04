/*METHOD-1 GREEDY APPROACH WITH ARRAYS */

/*public class intToRom {
    public String intToRoman(int num) {
        // Arrays for Roman numerals and their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        
        // Iterate over the arrays
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return roman.toString();
    }
}*/


/*METHOD-2 LinkedHashMap */
import java.util.*;
class intToRom{
    public String intToRoman(int num) {
        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);

        StringBuilder roman=new StringBuilder();

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            while(num>=entry.getValue()){
                roman.append(entry.getKey());
                num-=entry.getValue();
            }
        }
        return roman.toString();
    }
    public static void main(String[] args) {
        intToRom obj=new intToRom();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String result=obj.intToRoman(n);
        System.out.println(result);
    }
}