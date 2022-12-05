package baseball.model;

import java.util.List;

public class Baseball {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    private final List<Integer> baseballNumber;

    public Baseball(List<Integer> baseballNumber) {
        this.baseballNumber = baseballNumber;
    }

    public int size() {
        return baseballNumber.size();
    }
    public List<Integer> getBaseballNumber() {
        return baseballNumber;
    }
    public boolean hasNumber(int idx, int number) {
        if(baseballNumber.get(idx) == number) {
            return true;
        }
        return false;
    }
    public int getNumber(int idx) {
        return baseballNumber.get(idx);
    }
}
