
public class Owner {
	String name;
	String address;
	int numberOfPets;
	
	public Owner(String name, String address, int numberOfPets) {
		this.name = name;
		this.address = address;
		this.numberOfPets = numberOfPets;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
}
