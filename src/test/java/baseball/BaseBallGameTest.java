package baseball;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseBallGameTest {

    @Test
    @DisplayName("3자리의 값이 아닐 경우 테스트")
    void is3LengthData() {
        assertThrows(IllegalArgumentException.class, () -> new BaseballGame().is3LengthData("1234"));
        assertThrows(IllegalArgumentException.class, () -> new BaseballGame().is3LengthData("가나"));
    }

}
