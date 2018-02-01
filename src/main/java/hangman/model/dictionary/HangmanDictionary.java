/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model.dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2106913
 */
public abstract class HangmanDictionary {

    private List<Character> characterSet;
    private List<String> availableWords;

    public HangmanDictionary() {
        characterSet = createCharacterSet();
    }

    public List<Character> createCharacterSet() {
        List<Character> result = new ArrayList<>();
        char begin = 65;
        char end = 65 + 26;
        for (char c = begin; c < end; c++) {
            result.add(c);
        }
        return result;
    }

    public void setCharactersSet(List<Character> characterSet) {
        this.characterSet = characterSet;
    }

    public List<Character> getCharacterSet() {
        return characterSet;
    }

    public void setAvalariableWords(List<String> availableWords) {
        this.availableWords = availableWords;
    }

    public List<String> getAvailableWords(){
        return availableWords;
    }

}
