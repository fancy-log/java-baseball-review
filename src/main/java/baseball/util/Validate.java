package baseball.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validate {
    private final String ERROR_MESSAGE = "[ERROR] : ";
    private final int ZERO = 0;
    private final int BASEBALL_LENGTH = 3;
    private static final int RESTART = 1;
    private static final int QUIT = 2;

    public void validateNumberRange(List<Integer> user) {
        Set<Integer> userNoDuplicate = new HashSet<>(user);
        if(userNoDuplicate.size() != user.size()) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "서로 다른 3자리 숫자만 입력 가능합니다.");
        }
        if(!isCorrectForm(user)) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "0이 아닌 3자리 숫자만 입력 가능합니다.");
        }
    }
    private boolean isCorrectForm(List<Integer> user) {
        if (user.size() == BASEBALL_LENGTH && !user.contains(ZERO)) {
            return true;
        }
        return false;
    }
    public void validateRestartOrQuit(int reStart) {
        if(reStart != RESTART && reStart != QUIT) {
            throw new IllegalArgumentException(ERROR_MESSAGE + RESTART + "또는 " + QUIT + "만 입력 가능합니다.");
        }
    }
}
