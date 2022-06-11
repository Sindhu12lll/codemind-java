import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i,product=1;
        n=sc.nextInt();
        r=sc.nextInt();
        for(i=1;i<=r;i++)
        {
            if(i%2!=0)
            {
                product=n*i;
                System.out.printf("%d x %d = %d
",n,i,product);
            }
        }
    }
}