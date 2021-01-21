import java.text.SimpleDateFormat;

public class Singer {
	
	// singer name
	private String name;
	
	public void setName(String name)      
	   {                                             
	      this.name = name;
	   }         
	public String getName()        
	   {                                    
	      return name;     
	   }  
	// singer id
	private int id;
	
	public void setId(int id)      
	   {                                             
	      this.id = id;
	   }         
	public int getId()        
	   {                                    
	      return id;     
	   } 
	// singer date of birth
	private String dob;
	
	public void setDob(String dob)      
	   {                                             
	      this.dob = dob;
	   }         
	public String getDob()        
	   {                                    
	      return dob;     
	   } 
	// singer address
	private String address;
	
	public void setAdd(String address)      
	   {                                             
	      this.address = address;
	   }         
	public String getAdd()        
	   {                                    
	      return address;     
	   }
	// singer number of albums
	private int noAlbums;
	
	public void setNoAlb(int noAlbums)      
	   {                                             
	      this.noAlbums = noAlbums;
	   }         
	public int getNoAlb()        
	   {                                    
	      return noAlbums;     
	   }
	
	Singer ()
	{
		System.out.println("empty");
	}
	Singer (String name)
	{
		System.out.println("A");
	}
	Singer (String name, int id)
	{
		System.out.println("B");
	}
	Singer (String name, int id, String dob)
	{
		System.out.println("C");
	}
	Singer (String name, int id, String dob, int noAlbums)
	{
		System.out.println("D");
	}
	Singer (String name, int id, String dob, int noAlbums, String address)
	{
		System.out.println("D");
	}

	
	public static void main(String[] args) 
    { 
        Singer test = new Singer();
        System.out.println(test.toString());
        Singer anne = new Singer("Anne");
        System.out.println(anne.toString());
        Singer bob = new Singer("Bob", 2);
        System.out.println(bob.toString());
        Singer carl = new Singer("Carl", 3, "1982-20-02");
        System.out.println(carl.toString());
        Singer karen = new Singer("Karen", 4, "1970-04-04", 7);
        System.out.println(karen.toString());
        Singer jack = new Singer("Karen", 4, "1970-04-04", 7, "10 E. Main St.");
        System.out.println(jack.toString());
        
    } 

}
