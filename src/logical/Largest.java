package logical;

public class Largest {
	public static void main(String[] args) {
		int[] ar= {3,5,10,2,7};
		int large=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>large)
				large=ar[i];
		}
		System.out.println(large);
	}

}
