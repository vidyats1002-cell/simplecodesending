package logical;

public class Palidrome {
	public static void main(String[] args) {
		String s="level";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char r=s.charAt(i);
		     res= res+r;
		}
		if(s.equals(res))
			System.out.println("palidrome");
		else
			System.out.println("it is not palidrome");
	}

}
