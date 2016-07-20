public class Student {
	//private instance variables
	private String firstName;
	private String lastName;
	private int age;
	private int studentId;
	//public methods
	// accessModifier returnType nameOfMethod()
	public String getFirstName(){
		return this.firstName;
	}
	// void has no return type
 	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public int getAge(){
		return this.age;
	}
	 public void setAge(int age){
		 this.age = age;		
	}
	 public int getStudentId(){
		 return this.studentId;
	 }
     public void setStudentId(int studentId){
	      this.studentId = studentId;
     }
    public String toString(){
    	return "First Name: " + firstName + "Last Name: " + lastName
    			+ "Age: " + age + " StudentId " +studentId;
    }
}
// if private use public (getter and setter)