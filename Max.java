import java.util.*;
public class Max
{
    public static void main(String args[])
    {
        int n,max=0;
        Scanner io=new Scanner(System.in);
        n=io.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=io.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
            System.out.println(max);
    }
}
