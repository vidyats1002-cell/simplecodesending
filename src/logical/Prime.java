package logical;

public class Prime {
	public static void main(String[] args) {
		int n=6;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==1)
			count++;	
		}
		if(count==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
