
public class Employee 
{
	
	String firstname;
	String lastname;
	int id;

	public Employee(String firstname, String lastname, int id) 
	{
	System.out.println("Inside the contructor");
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}
	public Employee(int id, String firstname ,String lastname) 
	{
	System.out.println("Inside the  2 contructor");
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}
	
	
	public Employee(int id,float f) 
	{
	System.out.println("Inside the  3rd   contructor");
		
		
		System.out.println(" ID is:"+id);
		System.out.println(" Salary is:"+f);
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}

	
}
