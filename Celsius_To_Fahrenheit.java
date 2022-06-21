import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c,f;
        c=sc.nextFloat();
        f=((c*9)/5)+32;
        System.out.printf("%.2f",f);
    }
}