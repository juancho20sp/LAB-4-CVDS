/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author 2106913
 */

import hangman.model.English;
import hangman.model.French;
import hangman.model.Language;
import hangman.model.Spanish;
import hangman.model.dictionary.DictionaryHangman;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.view.HangmanColoridoPanel;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
        bind(Language.class).to(French.class);
        bind(DictionaryHangman.class).to(FrenchDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);
    }

}
