package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import baseball.model.Baseball;
import baseball.util.Validate;
import baseball.view.InputView;

public class User {
    private static final InputView inputView = new InputView();
    private static final Validate validate = new Validate();
    public Baseball getInput(String number) {
        List<Integer> user = mappingToList(number);
        validate.validateNumberRange(user);
        return new Baseball(user);
    }
    private static List<Integer> mappingToList(String input) {
        List<Integer> userNumber = new ArrayList<>();
        for(int index = 0; index < input.length(); index++) {
            int digit = strToInt(input, index);
            userNumber.add(digit);
        }
        return userNumber;
    }
    private static int strToInt(String input, int index) {
        char c = input.charAt(index);
        int value = Character.getNumericValue(c);
        return value;
    }
}
