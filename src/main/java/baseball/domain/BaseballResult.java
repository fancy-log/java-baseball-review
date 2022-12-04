package baseball.domain;

import java.util.HashMap;

import baseball.model.Baseball;

public class BaseballResult {
    private static final int ANSWER_COUNT = 3;
    private static final String STRIKE = "strike";
    private static final String BALL = "ball";
    private static final String NOTHING = "낫싱";

    private HashMap<String, Integer> result;

    public BaseballResult(HashMap<String, Integer> result) {
        this.result = result;
    }
    public String getResult() {
        if(result.isEmpty()) {
            return NOTHING;
        }
        if(!result.containsKey(STRIKE)) {
            return result.get(BALL) + "볼";
        }
        if(result.get(STRIKE) == ANSWER_COUNT) {
            return result.get(STRIKE) + "스트라이크";
        }
        return ballAndStrike();
    }
    public String ballAndStrike() {
        String ball = result.get(BALL) + "볼";
        String strike = result.get(STRIKE) + "스트라이크";
        return ball + ' ' + strike;
    }
    public boolean isAllCount() {
        return result.containsKey(STRIKE) && result.get(STRIKE) == ANSWER_COUNT;
    }
}
