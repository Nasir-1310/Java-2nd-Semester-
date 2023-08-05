
public abstract class Teacher {

	   String Name;
	   int Roll;
	   String Fa_name;
	   String Mo_name;
	   String Address;
	   Teacher(String Name,int Roll, String Fa_name,String Mo_name,String Address)
	   {
		   this.Name=Name;
		   this.Roll=Roll;
		   this.Fa_name=Fa_name;
		   this.Mo_name=Mo_name;
		   this.Address=Address;
	   }
	   abstract void  Information();
}
