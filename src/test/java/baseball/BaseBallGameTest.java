package baseball;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BaseBallGameTest {

    @Test
    @DisplayName("3자리의 값이 아닐 경우")
    void is3LengthData() {
        assertThrows(IllegalArgumentException.class, () -> new BaseballGame().is3LengthData("1234"));
        assertThrows(IllegalArgumentException.class, () -> new BaseballGame().is3LengthData("가나"));
    }

    @Test
    @DisplayName("중복된 숫자를 입력하였을 경우")
    void isNumberDuplicate() {
        assertFalse(new BaseballGame(Arrays.asList(new Ball(1,1), new Ball(2,2), new Ball(3,3))).isNumberDuplicate());
        assertThrows(IllegalArgumentException.class, () -> new BaseballGame(Arrays.asList(new Ball(1,1), new Ball(3,2), new Ball(3,3))).isNumberDuplicate());
    }

}
