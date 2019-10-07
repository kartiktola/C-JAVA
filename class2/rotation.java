import java.util.Scanner;
public class rotation
{   public static Scanner scn=new Scanner(System.in);
    
        public static int noOfDigits(int n)
        {
            int count_=0;
            while(n!=0)
            {
                n=n/10;
                count_++;
            } 
           return count_;
        }
        public static int rotate (int n, int r)
        {
            int digit=noOfDigits(n);
            r%=digit;
            r=r<0?r+digit:r;

            int mult=1;
            int div=1;

            for (int i=1; i<= digit;i++)
            {
                if (i<=r)
                    mult*=10;
                else{
                    div*=10;
                }
            }
            int rem = n%div;
            n=n/div;
            return(rem* mult + n);
        }
        public static void main(String[] args)
    {
        int n=scn.nextInt();
        int r= scn.nextInt();
        System.out.println(rotate(n,r));
    }

}