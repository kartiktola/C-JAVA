import java.util.ArrayList;
import java.util.Scanner;
public class mazePath{
    public static Scanner scn=new Scanner(System.in);
    public static ArrayList<String> mazePath(int sr, int sc, int er, int ec){
        if(sc==ec&&sr==er)
        {
            ArrayList<String> Base= new ArrayList<>();
            Base.add("");
            return Base;
        }
        ArrayList<String> ans=new ArrayList<>();
        if (sc+1<=ec){
            ArrayList<String> Horizontal= mazePath(sr, sc +1, er, ec);
            for (String s:Horizontal){
                ans.add("H"+s);
            }
        }
        if (sr+1<=er){
            ArrayList<String> vertical= mazePath(sr+1, sc, er, ec);
            for(String s:vertical){
                ans.add("V"+s);
            }
        }

    return ans;
    }
    public static void main(String[] args) {
        int sr= scn.nextInt();
        int sc= scn.nextInt();
        int er= scn.nextInt();
        int ec= scn.nextInt();
        System.out.println(mazePath(sr,sc,er,ec));
    }
}