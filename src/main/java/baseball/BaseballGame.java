package baseball;

import java.util.ArrayList;
import java.util.List;

import baseball.model.Baseball;
import baseball.util.Validate;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final OutputView outputView = new OutputView();
    private static final InputView inputView = new InputView();
    private static final Validate validate = new Validate();
    Baseball baseball;
    private boolean flag = true;
    public void init() {
        Baseball computer = createComputerRandomNumber();
        while(flag) {
            String number = inputView.readNumber();
            List<Integer> user = mappingToList(number);
            validate.validateNumberRange(user);
        }
    }
    private Baseball createComputerRandomNumber() {
        return new Computer().createRandomNumber();
    }
    public List<Integer> mappingToList(String input) {
        List<Integer> userNumber = new ArrayList<>();
        for(int index = 0; index < input.length(); index++) {
            int digit = strToInt(input, index);
            userNumber.add(digit);
        }
        return userNumber;
    }
    public int strToInt(String input, int index) {
        char c = input.charAt(index);
        int value = Character.getNumericValue(c);
        return value;
    }
}
