import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,r,i,sum=0;
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            sum=0;
            while(a!=0)
            {
                r=a%10;
                sum=sum+r;
                a=a/10;
            }
            a=sum;
        }
        System.out.printf("%d",sum);
    }
}