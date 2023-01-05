package main.setsandmaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    Map <String, String> words;
    public DictionaryService(){
        words = new HashMap<String, String>();
    }
    
    // add word/definition pair
    public void addWordDefinitionPair(String word, String definition){
        words.put(word, definition);
    }

    // get the definition value using the word key
    public String retriveDefinition(String word){
        return words.get(word);
    }

     // remove the key 
     public void removeDefinition(String word){
        words.remove(word);
    }

}
