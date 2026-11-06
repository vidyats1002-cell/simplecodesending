package logical;

public class Searching {
	static void search(int ar[],int key)
	{
		for(int i=0;i<ar.length; i++)
		{
			if(ar[i]==key)
			{
			System.out.println("element is found");
			return ;
			}
		}
		System.out.println("element not found");
	}
	public static void main(String[] args) {
		int [] ar= {5,9,2,1,7};
		int key=12;
		search(ar,key);
	
	}                                   

}
