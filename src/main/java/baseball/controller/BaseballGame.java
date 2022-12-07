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
import camp.nextstep.edu.missionutils.Console;

public class BaseballGame {
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final Validate validate = new Validate();
    private static final BaseballMaker baseballMaker = new BaseballMaker(new BaseballRandomNumberGenerator());
    private static Baseball computer;
    private boolean flag = true;
    private static final int RESTART = 1;
    private static final int END = 2;

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
            String input = inputView.readNumber();
            Baseball user = transformInputNumbers(input);
            result = user.compare(computer);
            result.showResult();
            if (result.isSuccess()) {
                int restartAnswer = askRestart();
                restartGame(restartAnswer);
            }
        }
        outputView.printSuccess();
    }

    private Baseball transformInputNumbers(String input) {
        List<Integer> user = new ArrayList<>();
        for (char number : input.toCharArray()) {
            user.add(Character.getNumericValue(number));
        }
        return new Baseball(user);
    }

    private int askRestart() {
        outputView.printRestartOrEnd();
        int askNumber = getRestart();
        return askNumber;
    }

    private int getRestart() {
        String reInput = Console.readLine();
        int reInputNum = Integer.parseInt(reInput);
        return reInputNum;
    }

    private void restartGame(int restartAnswer) {
        validate.validationRestartOrEnd(restartAnswer);
        if (restartAnswer == RESTART) {
            init();
        }
        if (restartAnswer == END) {
            flag = false;
        }
    }
}
