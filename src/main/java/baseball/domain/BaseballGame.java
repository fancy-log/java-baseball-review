package baseball.domain;

import java.util.HashMap;

import baseball.model.Baseball;
import baseball.util.Validate;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGame {
    private static final int RESTART = 1;
    private static final int QUIT = 2;
    private static final OutputView outputView = new OutputView();
    private static final InputView inputView = new InputView();
    private static final Validate validate = new Validate();
    BaseballResult baseballResult;
    Baseball baseball;
    Checker checker = new Checker();
    private boolean flag = true;
    public void init() {
        Baseball computer = createComputerRandomNumber();
        while (flag) {
            Baseball user = inputUserBaseball();
            baseballResult = compareNumber(user, computer);
            if (baseballResult.isAllCount()) {
                String result = baseballResult.getResult();
                outputView.printAnswer(result);
                outputView.printAllCorrect();
                int restartAnswer = askRestart();
                processRestartAnswer(restartAnswer);
            } else {
                String result = baseballResult.getResult();
                outputView.printAnswer(result);
            }
        }
    }

    private Baseball createComputerRandomNumber() {
        return new Computer().createRandomNumber();
    }
    private Baseball inputUserBaseball() {
        User user = new User();
        String number = inputView.readNumber();
        return user.getInput(number);
    }
    private BaseballResult compareNumber(Baseball user, Baseball computer) {
        HashMap<String, Integer> check_result = checker.start(user, computer);
        return new BaseballResult(check_result);
    }
    private int askRestart() {
        outputView.printRestart();
        int reStart = getRestart();
        return reStart;
    }
    private int getRestart() {
        String s = Console.readLine();
        int reStartNum = Integer.parseInt(s);
        return reStartNum;
    }
    private void processRestartAnswer(int restart) {
        validate.validateRestartOrQuit(restart);
        if(restart == RESTART) {
            init();
        }
        if(restart == QUIT) {
            flag = false;
        }
    }
}
