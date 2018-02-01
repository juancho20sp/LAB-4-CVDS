package hangman;

import com.google.inject.Inject;
import hangman.controller.*;
import hangman.model.*;
import hangman.model.dictionary.HangmanDictionary;
import hangman.setup.factoryMethod.HangmanFactoryMethod;
import hangman.view.*;

import java.awt.*;

import static hangman.SwingProject.CONTRIBUTORS;
import static hangman.SwingProject.PROJECT_NAME;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GUI {

    public static final String SCORE_NUMBER[] = {
            "Omar Rodriguez..00",
            "Nahid Enayatzadeh..00",
            "Marc Deaso..00",
            "Christopher Santos..00",
            "Jazmin Guerrero..00"};


    public static final String SPLASH_KEY = "splashscreen";
    public static final String FUNCTION_KEY = "functionscreen";
    public static final String HIGH_SCORE_KEY = "highscorescreen";
    public static final String CREDITS_KEY = "creditsscreen";
    public static final String GAME_KEY = "gamescreen";
    public static final String GAME_OVER_KEY = "gameoverscreen";

    private Language language;
    private HangmanDictionary dictionary;
    private HangmanPanel hangmanPanel;

    private MainFrameController mainFrameController;

    private SplashController splashController;
    private FunctionController functionController;
    private GameController gameController;
    private CreditsController creditsController;
    private GameOverController gameoverController;
    private HighScoreController highScoreController;

    // Use Factory method
    public GUI(HangmanFactoryMethod factoryMethod) {
        this.language = factoryMethod.createLanguage();
        this.dictionary = factoryMethod.createDictionary();
        this.hangmanPanel = factoryMethod.createHangmanPanel();
    }

    @Inject
    // Use Guice constructor
    public GUI(Language language, HangmanDictionary dictionary, HangmanPanel hangmanPanel){
        this.language = language;
        this.dictionary= dictionary;
        this.hangmanPanel = hangmanPanel;
    }

    //method: setup
    //purpose: Create the various panels (game screens) for our game
    // and attach them to the main frame.
    private void setup(){
        mainFrameController = new MainFrameController(
                new MainFrameModel(PROJECT_NAME,600,400,null,EXIT_ON_CLOSE),
                new MainFrame()
        );

        splashController = new SplashController(
                new SplashPanel(),
                new SplashModel(PROJECT_NAME,"REDS", Color.BLACK,3000),
                mainFrameController
        );

        functionController = new FunctionController(
                new FunctionPanel(language),
                new FunctionModel(Color.BLACK, language.getFunctionControllerNames()[0], language.getFunctionControllerNames()[1], language.getFunctionControllerNames()[2]),
                mainFrameController
        );

        GameModel gameModel = new GameModel(dictionary);
        gameController = new GameController(
                new GamePanel(gameModel.getCharacterSet(), hangmanPanel, language),
                gameModel,
                mainFrameController, language
        );

        creditsController = new CreditsController(
                new CreditsPanel(),
                new CreditsModel(language.getFunctionControllerNames()[2], CONTRIBUTORS, Color.BLACK, language),
                mainFrameController
        );

        gameoverController = new GameOverController(
                new GameOverPanel(language),
                new GameOverModel(language),
                mainFrameController, language
        );
        highScoreController = new HighScoreController(
                new HighScorePanel(),
                new HighScoreModel(language.getFunctionControllerNames()[1], SCORE_NUMBER, Color.BLACK, language),
                mainFrameController
        );

        mainFrameController.addPanel(splashController.getPanel(),SPLASH_KEY);
        mainFrameController.addPanel(functionController.getPanel(),FUNCTION_KEY);
        mainFrameController.addPanel(gameController.getPanel(),GAME_KEY);
        mainFrameController.addPanel(creditsController.getPanel(),CREDITS_KEY);
        mainFrameController.addPanel(gameoverController.getPanel(),GAME_OVER_KEY);
        mainFrameController.addPanel(highScoreController.getPanel(),HIGH_SCORE_KEY);

        functionController.setGameControllerReference(gameController);
        gameoverController.setGameControllerReference(gameController);
    }

    //method: setupAndStart
    //purpose: call setup method, switch to first application screen (splash)
    //then set the whole thing visible
    private void setupAndStart(){
        javax.swing.SwingUtilities.invokeLater(() -> {
            setup();
            mainFrameController.changeVisibleCard(SPLASH_KEY);
            mainFrameController.getFrame().setVisible(true);
        });
    }

    public void play() {
        setupAndStart();
    }
}
