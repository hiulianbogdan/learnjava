package temajava;

public class animal {
	private String animalName;
	

	public void setName (String name) {
		animalName = name;
	}
	public String getName() {
		return animalName;
	}
	public void displayName() {
		System.out.printf("Your animal name is %s\n", getName());
	}
	
	
}
