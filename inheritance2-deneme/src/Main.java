
public class Main {

	public static void main(String[] args) 
	{
		User user = new User("1234567","m.kostek24@hotmail.com");
		Student student = new Student("M�cahit","K�STEK","�stanbul");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	

	}

}
