import java.util.Scanner;//import this to take inputs
public class GreatestNumber
{   public static Scanner scn=new Scanner(System.in);//scanner is to take input
    //scn is a variable 
    public static void main(String[] args) {
    
        System.out.println("enter a:");
        int a =scn.nextInt();
        
        System.out.println("enter b:");
        int b=scn.nextInt();
        
        System.out.println("enter c:");
        int c=scn.nextInt();

        if (a>b && a>c)
            System.out.println(a);
        else if (b>a && b>c)
            System.out.println(b);
        else
            {
                System.out.println(c);
            }
    }
}