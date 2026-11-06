package logical;

public class Oddarray {
	public static void main(String[] args) {
		int[] ar= {3,5,10,2,7};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==1)
				System.out.println(ar[i]);
		}
	}

}
