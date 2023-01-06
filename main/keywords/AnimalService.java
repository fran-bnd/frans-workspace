package main.keywords;

public class AnimalService {
    Animal myAnimal;
    public AnimalService(){
        myAnimal = new Animal("species");
    }
    
    public void changeAnimalName(String name){
        myAnimal.setName(name);
    }

}
