package logical;

public class Sumevenodd {public static void main(String[] args) {
	int[] ar= {3,5,10,2,7};
	int sumeven=0,sumodd=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]%2==0)
			sumeven=sumeven+ar[i];
		else
			sumodd=sumodd+ar[i];
	}
	System.out.println("sum even="+sumeven);
	System.out.println("sum odd="+sumodd);
}

}
