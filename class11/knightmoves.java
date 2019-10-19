import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
public class knightmoves{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<String>();
      System.out.println(knight(0,0,3,3,new boolean[4][4]));
    }

public static boolean isValid1(int x,int y,boolean[][] isdone){
      if(x>=0 && y>=0 && x<isdone.length && y<isdone[0].length && !isdone[x][y] ) return true;
      return false;
    }
    public static int knight(int sr,int sc,int er,int ec,boolean[][] isdone){
        if(sr==er && sc==ec){
        return 1;
        }
        int[][] dir={{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
            
        isdone[sr][sc]=true;
        int count=0;
        for(int d=0;d<dir.length;d++){
            int x=sr+dir[d][0];
            int y=sc+dir[d][1];    
        if(isValid1(x,y,isdone)){
           count+= knight(x,y,er,ec,isdone);
            }  
        }
        isdone[sr][sc]=false;
        return count;
    }
}

//........................................................................................................

public static ArrayList<String> keypad_01