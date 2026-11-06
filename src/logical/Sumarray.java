package logical;

public class Sumarray {
	public static void main(String[] args) {
		int[] ar= {3,5,10,2,7};
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println(sum);
	}

}
