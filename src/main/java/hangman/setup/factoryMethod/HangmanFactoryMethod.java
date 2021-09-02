package hangman.setup.factoryMethod;

import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;

abstract public class HangmanFactoryMethod {
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
    abstract public GameScore createGameScore(int type);
}
