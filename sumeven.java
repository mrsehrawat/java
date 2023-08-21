import java.util.*;
class sumeven
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the even numbers till which you want addition");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of even numbers till "+n+" are : "+sum);
	}
}