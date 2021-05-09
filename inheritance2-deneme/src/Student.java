
public class Student extends User {

	private String firstName ;
	private String lastName;
	private String city;
	
	public Student (String firstName, String lastName, String city)
	{
		this.city=city;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
