import java.util.Scanner;
public class RecursionWithArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int[] arr = {10,5,10,20,10,30,12};
        int vidx=0;
        int data =scn.nextInt();
        int size = 0;
        System.out.println(allIndex(arr,vidx, data, size));

    }
    private static int[] allIndex(int[] arr, int vidx,int data,int size){
        
        if (vidx==arr.length){
           int[] baseArray = new int[size];
           return baseArray;
        }
        if (arr[vidx]==data)
           { size++;}
        int[] recAns= allIndex(arr, vidx + 1, data, size);
        if (arr[vidx]==data) {
            recAns[size - 1] = vidx;
        }
        return recAns;
    }
}