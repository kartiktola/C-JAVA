import java.util.Scanner;
public class power
{
    public static Scanner scn=new Scanner(System.in);
    public static int Pow (int a ,int b)
    { if (b==0)
        return 1;
    int res = Pow(a,b-1);
    return res*a;
    }
    public static void main(String[] args)
    {
        int a=scn.nextInt();
        int b= scn.nextInt();
        System.out.println(Pow(a,b));
    }
      
}