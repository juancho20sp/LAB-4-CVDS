package hangman.setup.factoryMethod;

import hangman.model.*;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public HangmanDictionary createDictionary() {
        return new EnglishDictionaryDataSource();
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        return new HangmanStickmanPanel();
    }

    @Override
    /**
     * @param type 0: Original, 1: Bonus, 2: PowerBonus
     */
    public GameScore createGameScore(int type) {
        switch (type){
            case 0:
                return new OriginalScore();
            case 1:
                return new BonusScore();
            case 2:
                return new PowerBonusScore();
            default:
                return new OriginalScore();
        }





    }
}
