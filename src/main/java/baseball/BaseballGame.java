package baseball;

import nextstep.utils.Console;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballGame {

    private List<Ball> playerBalls = new ArrayList<>();
    private List<Ball> computerBalls = new ArrayList<>();
    private boolean result;

    public BaseballGame() {
    }

    public BaseballGame(List<Ball> playerBalls) {
        this.playerBalls = playerBalls;
    }

    public void start() {
        make3Ball();
        while(play()) {
        }
    }

    public boolean play() {
        System.out.print("숫자를 입력해주세요 : ");
        String inputData = Console.readLine();
        try {
            this.result = is3LengthData(inputData) && make3BallForPlayer(inputData) && !isNumberDuplicate() && matchBall();
        } catch (NumberFormatException e) {
            printError(e.getMessage());
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
        }
        return result;
    }

    public boolean matchBall() {
        TotalCount totalCount = new TotalCount(computerBalls, playerBalls);
        totalCount.calculateCount();
        totalCount.print();

        return true;
    }

    public boolean is3LengthData(String inputData) {
        if (inputData.length() != 3) {
            throw new IllegalArgumentException("입력된 값이 3자리의 값이 아닙니다.");
        }
        return true;
    }

    public boolean make3BallForPlayer(String inputData) {
        playerBalls.clear();
        String[] numbers = inputData.split("");
        int ballIdx = 1;
        for (String number : numbers) {
            int ballNumber = Integer.parseInt(number);
            Ball ball = new Ball(ballNumber, ballIdx++);
            playerBalls.add(ball);
        }
        return true;
    }
    public void make3Ball() {
        Set<Integer> ballNumbers = new HashSet<>();
        int ballIdx = 1;
        while(ballNumbers.size() != 3) {
            ballNumbers.add(Randoms.pickNumberInRange(1, 9));
        }
        for (Integer ballNumber : ballNumbers) {
            computerBalls.add(new Ball(ballNumber, ballIdx++));
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
