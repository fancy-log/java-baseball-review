package baseball.controller;

import baseball.util.Validate;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final Validate validate = new Validate();

    public void run() {
        outputView.printGameStart();
        init();
    }

    private void init() {
        String input = inputView.readNoDuplicateNumber();
        validate.validationNumber(input);
    }
}
