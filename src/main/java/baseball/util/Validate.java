package baseball.util;

import java.util.List;
import java.util.Set;

public class Validate {
    private final String ERROR_MESSAGE = "[ERROR] : ";
    private final int ZERO = 0;
    private final int BASEBALL_LENGTH = 3;

    public void validateNumberRange(List<Integer> user) {
        if(user.size() != BASEBALL_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE + BASEBALL_LENGTH + "자리 숫자만 입력 가능합니다.");
        }
        if(Set.copyOf(user).size() != BASEBALL_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "서로 다른 3자리 숫자만 입력 가능합니다.");
        }
        if(user.contains(ZERO)) {
            throw new IllegalArgumentException(ERROR_MESSAGE + ZERO + "이 아닌 " + BASEBALL_LENGTH + "자리 숫자만 입력 가능합니다.");
        }
    }
}
