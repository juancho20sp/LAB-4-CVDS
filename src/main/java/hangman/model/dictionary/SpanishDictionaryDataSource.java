/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model.dictionary;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 2106913
 */
public class SpanishDictionaryDataSource extends HangmanDictionary {

    static private String words[] = {
        "GENERAL",
        "PRESIDENTE",
        "HOMBRE",
        "SEÑOR",
        "PROGRAMA"
    };

    public SpanishDictionaryDataSource() {
        setAvalariableWords(Arrays.asList(words));
    }

    @Override
    public List<Character> createCharacterSet() {
        List<Character> result = super.createCharacterSet();
        result.add((char) 209);
        return result;
    }

    @Override
    public List<String> getAvailableWords() {
        return Arrays.asList(words);
    }

}
