import java.util.Scanner;
public class ReturnType{
     public static Scanner scn=new Scanner(System.in);
    public static String RemoveHI(String ques) {
        if (ques.length()==0){
            return "";
        }
        if (ques.length()>1 && ques.substring(0,2).equals("hi")||ques.length()>1 && ques.substring(0,2).equals("HI"))
        {
            return RemoveHI(ques.substring(2));
        }
        else{
            char ch = ques.charAt(0);
            return ch + RemoveHI(ques.substring(1));
        }
    }
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
        String ques= scn.nextLine();
        String ans=RemoveHI(ques);
        System.out.println(ans);
        String str = scn.nextLine();
        int idx=1;
        int count=1;
        String ans = Compression(str, idx, count);
        System.out.println(ans);
    }
}
    
    