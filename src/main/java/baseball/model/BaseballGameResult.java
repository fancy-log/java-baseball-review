package baseball.model;

import baseball.view.OutputView;

public class BaseballGameResult {
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
}
