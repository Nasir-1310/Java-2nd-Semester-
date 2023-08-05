public class Student_2 extends Teacher {

	Student_2(String Name,int Roll, String Fa_name,String Mo_name,String Address)
	{
		super(Name,Roll, Fa_name, Mo_name,Address);
		
		   
	   }
	      void  Information() {
	    	System.out.println("Student_2 Information");
	    	 System.out.println("  Name :"+Name);
	    	 System.out.println("  Roll :"+Roll);

	    	 System.out.println("  Father name :"+Fa_name);
	    	 System.out.println("  Mother name :"+Mo_name);
	    	 System.out.println("  Hometown :"+Address);
	      	 System.out.println("  ");


		}
	
}
