package baseball;

import baseball.domain.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    private static final BaseballGame baseballGame = new BaseballGame();
    private static OutputView outputView = new OutputView();
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        init();
    }

    private static void init() {
        outputView.printGameStart();
        baseballGame.init();
    }
}
