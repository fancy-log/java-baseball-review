package baseball;

import java.util.HashMap;
import java.util.List;

import baseball.model.Baseball;

public class Checker {
    private static final String STRIKE = "strike";
    private static final String BALL = "ball";
    private HashMap<String, Integer> result;
    private Baseball computer;

    public HashMap<String, Integer> start(Baseball user, Baseball computer) {
        this.computer = computer;
        result = compare(user);
        return result;
    }
    private HashMap<String, Integer> compare(Baseball user) {
        HashMap<String, Integer> result = new HashMap<>();
        for(int i = 0; i < user.size(); i++) {
            if(isStrike(i, user)) {
                result.put(STRIKE, result.getOrDefault(STRIKE, 0)+1);
                continue;
            }
            if(isBall(i, user)) {
                result.put(BALL, result.getOrDefault(BALL, 0)+1);
            }
        }
        return result;
    }
    private boolean isStrike(int i, Baseball user) {
        if(computer.hasNumber(i, user.getNumber(i))) {
            return true;
        }
        return false;
    }
    private boolean isBall(int i, Baseball user) {
        List<Integer> computerBaseballNumber = computer.getBaseballNumber();
        if(computerBaseballNumber.contains(user.getNumber(i))) {
            return true;
        }
        return false;
    }
}
