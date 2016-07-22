public class Employee {
	private String firstName;
	private String lastName;
	private int age;
	private String officeCity;
	private int id;
	public Employee(String firstName, String lastName, int age ,String officeCity , int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.officeCity = officeCity;
		this.id = id;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		  return this.lastName;
	  }
    public void  setAge(int age){
    	this.age = age ;
    }
    public int getAge(){
    	return this.age;
    }
    public void setOfficeCity(String officeCity){
    	this.officeCity = officeCity;
    }
    public String getOfficecity(){
    	return this.officeCity;
    }
    public void setId(int id){
    	this.id = id;
    }
     public int getId(){
    	 return this.id;
    }
    @Override
    public String toString(){
    	return "Employee Details: " + "First Name: " + firstName
    			+ "Last Name: " + lastName + "Age: " + age
    			+ "Office City: " + officeCity + "Employee Id: " + id;
    }
}
//LastName
//age
//oficeLocation
//id