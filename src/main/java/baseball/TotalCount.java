package baseball;

import java.util.List;

public class TotalCount {
    private int strike;
    private int ball;
    private List<Ball> computerBalls;
    private List<Ball> playerBalls;

    public TotalCount(List<Ball> computerBalls, List<Ball> playerBalls) {
        this.computerBalls = computerBalls;
        this.playerBalls = playerBalls;
    }

    public void calculateCount() {
        for (int i = 0; i < 3; i++) {
            compareBall(computerBalls.get(i), playerBalls.get(i));
        }
    }

    public void compareBall(Ball computerBall, Ball playerBall) {
        if (computerBall.equals(playerBall)) {
            this.strike++;
            return;
        }
        for (Ball ball : computerBalls) {
            calculateBallCount(ball, playerBall);
        }

    }

    private void calculateBallCount(Ball computerBall, Ball playerBall) {
        if (computerBall.getBallNumber() == playerBall.getBallNumber()) {
            this.ball++;
        }

    }

    public void print() {
        if (this.strike == 0 && this.ball == 0) {
            System.out.println("낫싱");
        }
        StringBuilder builder = new StringBuilder();
        if (this.strike > 0) {
            builder.append(this.strike + "스트라이크 ");
        }
        if (this.ball > 0) {
            builder.append(this.ball + "볼");
        }
        System.out.println(builder.toString());
    }

    public boolean isDone() {
        return this.strike == 3;
    }
}
