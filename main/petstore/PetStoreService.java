package main.petstore;

import java.util.LinkedList;
import java.util.List;

public class PetStoreService {
    List<Pet> pets;
    public PetStoreService(){
        // instantiate pets
        pets = new LinkedList<Pet>();
        // an interface may have multiple implementing classes - classes can exhibit the behaviors defined by an interface
    }

    public void addPet(Pet name){
        pets.add(name);
        System.out.println("You added "+ name);
    }

    public void purchasePet(String name){
        // remove with the name of the pet
        // for every pet, check every pet in 'pets' for if the name matches 'name' and if they match, remove the current pet
        for (int i=0; i<pets.size();i++){
            Pet currentPet = pets.get(i);
            String currentPetName = currentPet.name;
            if (currentPetName.equals(name)){
                System.out.println("You purchased "+ pets.get(i).name);
                pets.remove(i);
            }
        }

    }

    // Print the List Object
    public List<Pet> getPets(){
        return pets;
    }

}
