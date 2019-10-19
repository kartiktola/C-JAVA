import java.util.ArrayList;
import java.util.Scanner;
public class floodfill{
    public static Scanner scn=new Scanner(System.in);
    public static ArrayList<String> floodFill(int sr,int sc,int er,int ec, boolean isdone){
        if(sc==er && sr==ec)
        {
            ArrayList<String> Base= new ArrayList<>();
            Base.add("");
            return Base;
        }
        ArrayList<String> myAns=new ArrayList<>();
        isdone[sr][sc] = true;
        if (sc+1<=ec && !isdone[sr][sc+1]){
            ArrayList<String> right= floodFill(sr, sc +1, er, ec, isdone);
            for (String s:right){
                ans.add("R"+s);
            }
        }
        if (sc-1<=0 && !isdone[sr][sc-1]){
            ArrayList<String> down= floodFill(sr, sc +1, er, ec, isdone);
            for (String s:down){
                ans.add("D"+s);
            }
        }
        if (sr+1<=er && !isdone[sr+1][sc] ){
            ArrayList<String> vertical= floodFill(sr+1, sc, er, ec, isdone);
            for(String s:vertical){
                ans.add("U"+s);
            }
        }
        if (sr-1>=0 && !isdone[sr-1][sc]){
            ArrayList<String> upward= floodFill(sr+1, sc, er, ec, isdone);
            for(String s:upward){
                ans.add("U"+s);
            }
        }
    isdone[sr][sc] = true;
    
    return myAns;
    }

    public static void main(String[] args) {
       
        System.out.println(floodFill(sr,sc,er,ec, isdone));
    }
}