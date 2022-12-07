package baseball.controller;

import java.util.List;

import baseball.model.BaseballMaker;
import baseball.model.BaseballRandomNumberGenerator;
import baseball.util.Validate;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final Validate validate = new Validate();
    BaseballMaker baseballMaker = new BaseballMaker(new BaseballRandomNumberGenerator());

    public void run() {
        outputView.printGameStart();
        init();
    }

    private void init() {
        List<Integer> computer = baseballMaker.makeNumber();
        String input = inputView.readNoDuplicateNumber();
        validate.validationNumber(input);
        System.out.println("computer : " + computer);
        System.out.println("user : " + input);
    }
}
