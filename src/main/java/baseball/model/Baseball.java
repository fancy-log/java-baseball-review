package baseball.model;

import java.util.List;

public class Baseball {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    private final List<Integer> baseballNumber;

    public Baseball(List<Integer> baseballNumber) {
        this.baseballNumber = baseballNumber;
    }
}
