
public class Animal {
	//Data fields -- private for incapsulation
	private String species;
	private int age;
	private Owner owner; //This is an example of composition -- each Animal HAS A(n) owner
	
	//Constructor with arguments -- 'this' refers to the data fields' variables
	public Animal(String species, int age, Owner owner) {
		this.species = species;
		this.age = age;
		this.owner = owner;
	}
	//Constructor without arguments
	public Animal() {
		this.species = "Unknown";
		this.age = -1;
		owner = null;
	}
	
	//This method, along with the others, will be inherited by all classes that extend Animal
	public void makeNoise() {
		System.out.println("I am an animal of species " + species + " and am " + age + " years old!");
	}
	
	//Getters and setters
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
