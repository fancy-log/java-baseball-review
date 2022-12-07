package baseball.controller;

import java.util.ArrayList;
import java.util.List;

import baseball.model.Baseball;
import baseball.model.BaseballGameResult;
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
    Baseball computer;
    private boolean flag = true;

    public void run() {
        init();
        gameStart();
    }

    private void init() {
        outputView.printGameStart();
        computer = new Baseball(baseballMaker.makeNumber());
    }

    private void gameStart() {
        BaseballGameResult result;
        while (flag) {
            String input = inputView.readNoDuplicateNumber();
            Baseball user = transformInputNumbers(input);
            result = user.compare(computer);
            result.showResult();
        }
    }

    private Baseball transformInputNumbers(String input) {
        List<Integer> user = new ArrayList<>();
        for (char number : input.toCharArray()) {
            user.add(Character.getNumericValue(number));
        }
        return new Baseball(user);
    }

}
