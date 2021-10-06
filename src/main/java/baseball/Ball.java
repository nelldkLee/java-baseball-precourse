package baseball;

public class Ball {

    private int ballNumber;
    private int idx;

    public Ball(int ballNumber, int idx) {
        this.ballNumber = ballNumber;
        this.idx = idx;
        isNumber1to9(this.ballNumber);
    }

    public boolean isNumber1to9(int number) {
        if (number > 0 && number <= 9) {
            return true;
        }
        throw new IllegalArgumentException("1과 9사이의 숫자만 입력가능합니다.");
    }

    public int getBallNumber() {
        return ballNumber;
    }
}
