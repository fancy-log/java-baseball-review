package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readNoDuplicateNumber() {
        System.out.println("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        return number;
    }
}
