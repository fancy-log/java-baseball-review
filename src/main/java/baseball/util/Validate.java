package baseball.util;

import java.util.List;

public class Validate {
    private final String ERROR_MESSAGE = "[ERROR] : ";

    public void validateNumberRange(String user) {
        if(!user.matches("[0-9+]")) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "숫자만 입력 가능합니다.");
        }

    }
}
