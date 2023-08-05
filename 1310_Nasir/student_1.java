public class student_1 extends Teacher {
           
	student_1(String Name,int Roll, String Fa_name,String Mo_name,String Address)
	{
		  super(Name,Roll,Fa_name,Mo_name, Address);
	   }
	void  Information() {
  	 System.out.println("Student_1 Information");
  	 System.out.println("  Name :"+Name);
  	 System.out.println("  Roll :"+Roll);

  	 System.out.println("  Father name :"+Fa_name);
  	 System.out.println("  Mother name :"+Mo_name);
  	 System.out.println("  Hometown:"+Address);
  	 System.out.println("  ");
}
}