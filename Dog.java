
public class Dog extends Animal{
	private String breed;
	
	public Dog(String species, int age, Owner owner, String breed) {
		super(species, age, owner); //Calls constructor of super class to set data fields
		this.breed = breed;
		//Private variables are from Animal are inherited, but not directly accessible. 
		//You have to use accessors or mutators (getters or setters) to use data fields, 
			//or change their type to either protected or public in the superclass 
	}
	
	//Overriding
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Roof Roof! I am a " + this.breed + " dog and my owner is: " + this.getOwner().getName());
	}
	
	public void dogOnlyMethod() {
		System.out.println("This is a method that is defined only in the dog class and not its super class!");
	}
}
