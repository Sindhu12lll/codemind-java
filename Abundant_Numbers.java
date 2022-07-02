import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,r,sum=0,temp;
        n=sc.nextInt();
        temp=n;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum>temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}