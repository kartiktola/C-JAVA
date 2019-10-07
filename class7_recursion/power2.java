import java.util.Scanner;
public class power2
{
    public static Scanner scn=new Scanner(System.in);
    public static int Pow (int a ,int b)
    { if (b==0)
        return 1;
    int res = Pow(a,b/2);
    res*=res;
    return ((b&1)==0)? res:res*a; //(b%2==0) return (res);else{return res*a;}
    }

    public static void main(String[] args)
    {
        int a=scn.nextInt();
        int b= scn.nextInt();
        System.out.println(Pow(a,b));
    }
      
}