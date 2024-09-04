import java.util.*;
public class commonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();

        //sort the array
        Arrays.sort(strs);

        //get the first and last strings and convert it into charArray
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        //start comapring
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        commonPrefix obj = new commonPrefix();
        String[] str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n=sc.nextInt();
        sc.nextLine();
        str=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the string");
            str[i]=sc.nextLine();
            }
        System.out.println("The longest common prefix is "+obj.longestCommonPrefix(str));
    }
}
