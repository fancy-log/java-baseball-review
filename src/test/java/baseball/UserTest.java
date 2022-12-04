package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import baseball.domain.User;

class UserTest {
    User user = new User();

    @DisplayName("0 또는 서로 다른 3자리 숫자가 아니면 오류")
    @ParameterizedTest
    @ValueSource(strings = {"1234", "111", "355", "010", "13579"})
    void NumberRangeError(String input) {
        Assertions.assertThatThrownBy(()->
                user.getInput(input))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("0 이 아닌 서로 다른 3자리 숫자인지 확인")
    @ParameterizedTest
    @ValueSource(strings = {"123", "246", "369", "567", "912"})
    void NumberRangeOk(String input) {
        assertDoesNotThrow(()->
            user.getInput(input));
    }
}