package baseball.model;

import baseball.view.OutputView;

public class BaseballGameResult {
    private static final int ALL_SUCCESS = 3;
    private int ballCount;
    private int strikeCount;
    private static final OutputView outputView = new OutputView();

    public BaseballGameResult(int ball, int strike) {
        this.ballCount = ball;
        this.strikeCount = strike;
    }

    public void showResult() {
        outputView.printResult(ballCount, strikeCount);
    }

    public boolean isSuccess() {
        if (strikeCount == ALL_SUCCESS) {
            return true;
        }
        return false;
    }
}
