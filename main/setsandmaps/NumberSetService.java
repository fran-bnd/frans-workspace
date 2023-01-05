package main.setsandmaps;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class should be able to add numbers to set, check if num is contained and remove from list
 */
public class NumberSetService {
    // Sets contain unique elements- duplicates no allowed
    // vs. Lists contain ordered elemnts- allowing duplicates
    Set<Integer> numbers;
    public NumberSetService(){
        numbers = new HashSet<>();
    }

    public void addTwoNumbers(int num){
        // Autoboxing: the primitive autmoatically gets 'boxed' into an Objet
        numbers.add(num);
    }
    
    public boolean checkNumbers(int num){
        return numbers.contains(num);
    }

    public void removeNumber(int num){
        numbers.remove(num);
    }

}
