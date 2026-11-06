package logical;

public class Evenindex {
	public static void main(String[] args) {
		int[] ar= {3,5,10,2,7};
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
				System.out.println(ar[i]);
		}
	}

}
