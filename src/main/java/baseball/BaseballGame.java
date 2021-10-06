package baseball;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballGame {

    private List<Ball> playerBalls = new ArrayList<>();

    public BaseballGame() {
    }

    public BaseballGame(List<Ball> playerBalls) {
        this.playerBalls = playerBalls;
    }

    public void start() {
        while(play()) {
        }
    }

    public boolean play() {
        System.out.print("숫자를 입력해주세요 : ");
        String inputData = Console.readLine();

        try {
            is3LengthData(inputData);
            make3Ball(inputData);
            isNumberDuplicate();
        } catch (NumberFormatException e) {
            printError(e.getMessage());
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
        }
        return true;
    }

    public void is3LengthData(String inputData) {
        if (inputData.length() != 3) {
            throw new IllegalArgumentException("입력된 값이 3자리의 값이 아닙니다.");
        }
    }

    public void make3Ball(String inputData) {
        playerBalls.clear();
        String[] numbers = inputData.split("");
        int ballIdx = 1;
        for (String number : numbers) {
            int ballNumber = Integer.parseInt(number);
            Ball ball = new Ball(ballNumber, ballIdx++);
            playerBalls.add(ball);
        }
    }

    public boolean isNumberDuplicate() {
        Set<Integer> balls = new HashSet<>();
        for (Ball playerBall : playerBalls) {
            balls.add(playerBall.getBallNumber());
        }

        if (playerBalls.size() == balls.size()) {
            return false;
        }

        throw new IllegalArgumentException("중복된 숫자를 입력하였습니다.");
    }

    public void printError(String message) {
        System.out.println("[ERROR] " + message);
    }

}
