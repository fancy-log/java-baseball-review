package baseball;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import baseball.model.Baseball;
import baseball.util.Validate;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final OutputView outputView = new OutputView();
    private static final InputView inputView = new InputView();
    private static final Validate validate = new Validate();
    BaseballResult baseballResult;
    Baseball baseball;
    Checker checker = new Checker();
    private boolean flag = true;
    public void init() {
        Baseball computer = createComputerRandomNumber();
        while(flag) {
            Baseball user = inputUserBaseball();
            baseballResult = compareNumber(user, computer);
            if(baseballResult.isAllCount()) {

            }
        }
    }
    private Baseball createComputerRandomNumber() {
        return new Computer().createRandomNumber();
    }
    private Baseball inputUserBaseball() {
        User user = new User();
        return user.getInput();
    }
    public BaseballResult compareNumber(Baseball user, Baseball computer) {
        HashMap<String, Integer> check_result = checker.start(user, computer);
        return new BaseballResult(check_result);
    }
}
