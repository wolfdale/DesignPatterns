// Creational Design Pattern
// | Class Creational Pattern

interface Pet{
	public String getSound();
}

class Dog implements Pet{
	public String getSound(){
		return "Woof !";
	}
}

class Cat implements Pet{
	public String getSound(){
		return "Meow !";
	}
}

class Cow implements Pet{
	public String getSound(){
		return "MOoo !";
	}
}

class PetFactoryLogic{
	Pet getPet(int val){
		Pet petObj = null;
		if(1 == val){
			petObj = new Dog();
		}
		else if (2 == val){
			petObj = new Cat();
		}
		else{
			petObj = new Cow();
		}
		return petObj;
	}
}

class Runner{
	public static void main(String []args){
		PetFactoryLogic petfactory = new PetFactoryLogic();
		// Here we dont know which object factory is created
		// we are using generalized Pet object to catch spesialized 
		// object.
		Pet  unknownPet = petfactory.getPet(3); 
		System.out.println(unknownPet.getSound());
		
		unknownPet = petfactory.getPet(1);
		System.out.println(unknownPet.getSound());
		
		unknownPet = petfactory.getPet(2);
		System.out.println(unknownPet.getSound());
	}
}	







		



