package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final OutputView outputView = new OutputView();
    private static final InputView inputView = new InputView();
    public void init() {
        outputView.printGameStart();
        String number = inputView.readNumber();
    }
}
