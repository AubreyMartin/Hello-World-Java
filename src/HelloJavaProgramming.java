public class HelloJavaProgramming {	
	public static void main(String[] args) {
		String myName = "Aubrey Martin";
		/* String nameOfTheString = "value of the string in quotes"; end with semicolon */
		/*Print the String, pass the name of the String without quotes */
		int age = 21;
		System.out.println("My Name is: " + myName + " and my age is: " + age);
		
		/* Student object */
		Student student1 = new Student();
		student1.setAge(21);
		student1.setFirstName("Aubrey");
		student1.setLastName("Martin");
		student1.setStudentId(9);
		System.out.println(student1.toString());
		
		/* Employee Object */
		Employee employee1 = new Employee("Aubrey","Martin", 21 , "Hyderabad", 67);
		//print the employee  object
		System.out.println(employee1.toString());
		//Object.toString -> returns the HashCode of that object
		// Therefore the toString() returnes the actual values after overriding 
	}
}
