package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BallTest {

    @Test
    @DisplayName("1~9 사이의 숫자가 아닐 경우 테스트")
    void isNumber1to9() {
        Assertions.assertTrue(new Ball(1, 1).isNumber1to9(1));
        Assertions.assertTrue(new Ball(9, 1).isNumber1to9(9));
        assertThrows(IllegalArgumentException.class, () -> new Ball(0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Ball(100, 1));
        assertThrows(IllegalArgumentException.class, () -> new Ball(-1, 1));
    }
}
