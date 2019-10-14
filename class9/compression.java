import java.util.Scanner;
public class compression{
    public static Scanner scn=new Scanner(System.in);
    
    public static String Compression(String str,int idx, int count){
        if (idx == str.length())//base case
      {
        String ans = str.charAt(idx-1) + (count>1?count+"":"");
        return ans;
      }
      if (str.charAt(idx-1)==str.charAt(idx))
      {
        return Compression(str, idx+1, count+1);
      }
      else{
          String ans = str.charAt(idx-1) + (count>1?count+"":"");
          return ans + Compression(str,idx+1,1);
      }
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        int idx=1;
        int count=1;
        String ans = Compression(str, idx, count);
        System.out.println(ans);
    }
}