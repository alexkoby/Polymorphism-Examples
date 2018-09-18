
public class Main {
	public static void main(String [] args) {
		//Animals down have any access to their children's methods
		Animal animalFish = new Animal("Fish", 4, new Owner("Prof. Fouh", "Bethlehem Avenue", 88)); //Fish god!
		animalFish.makeNoise();
		
		//Normal relationship -- always uses subclass's (Dog.java) version of method. If it isn't defined in dog,
			//Then it was inherited from it's super class, but it's still a part of the dog class
		Dog poodle = new Dog("Canine", 1, new Owner("Jerry", "22 Hill st", 1), "Golden Retriever");
		poodle.makeNoise();
		
		
		//Polymorphic relationship -- Parent at compile time, child at runtime. Any method used must be defined in the parent class,
			//Else, you will have to cast it. It will always try to use the children's version if it's defined in both classes.
		Animal polymorphicAnimal = new Dog("Canine" , 3, new Owner("Zunara", "Bethlehem drive", 6), "Lab");
		((Dog)polymorphicAnimal).dogOnlyMethod(); //Doesn't work, since this method isn't defined for an animal 
			//and it's an animal at compile time. Try casting
		polymorphicAnimal.makeNoise(); //Do you think this will use Dog's makeNoise method, or animal's makeNoise method?
		
		
	}
}
