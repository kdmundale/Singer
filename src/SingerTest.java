import java.util.Scanner;

public class SingerTest {
	
	public static void main(String[] args)
	   {
		Scanner inputName = new Scanner(System.in);
		
		Singer mySinger = new Singer();
		
		System.out.printf("Singer name is: %s%n%n", mySinger.getName());

	    System.out.println("Please enter name:");
	    
	    String theName = inputName.nextLine();
	    
	    mySinger.setName(theName);
	    
	    Scanner inputId = new Scanner(System.in);
	    
	    System.out.println("Please enter id:");
	    
	    int theId = inputId.nextInt();
	    
	    mySinger.setId(theId);
	    
	    Scanner inputDob = new Scanner(System.in);
		
	    System.out.println("Please enter DOB:");
	    
	    String theDob = inputDob.nextLine();
	    
	    mySinger.setDob(theDob);
	    
	    System.out.println();
	    
	    System.out.printf("Name:%s%n Id:%d%n DOB:%s%n", mySinger.getName(), mySinger.getId(), mySinger.getDob());

	   }

}
