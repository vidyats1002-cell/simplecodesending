package logical;

public class Precentage {
	public static void main(String[] args) {
		int marks=67;
		if(marks>=85 && marks<=100)
			System.out.println("distication");
		else if(marks>=65 && marks<85)
			System.out.println("Frist class");
		else if(marks>=50 && marks<65)
			System.out.println("Second class");
		else if(marks>=35 && marks<50)
			System.out.println("Pass");
		else if(marks<=35 && marks>=0)
			System.out.println("Fail");
		else
			System.out.println("Invalid marks");
		
		
	}
	

}
