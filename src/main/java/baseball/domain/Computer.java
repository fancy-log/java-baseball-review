package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import baseball.model.Baseball;
import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

    public Baseball createRandomNumber() {
        List<Integer> numbers = getRandomNumber();
        return new Baseball(numbers);
    }

    private List<Integer> getRandomNumber() {
        List<Integer> computer = new ArrayList<>();
        while(computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(Baseball.MIN_NUM, Baseball.MAX_NUM);
            if(!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
