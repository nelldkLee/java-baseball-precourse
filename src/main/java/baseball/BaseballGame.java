package baseball;

import nextstep.utils.Console;

import java.util.ArrayList;

public class BaseballGame {

    private ArrayList<Ball> playerBalls = new ArrayList<>();

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
        } catch (NumberFormatException e) {
            printError(e.getMessage());
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
        }
        return true;
    }

    private void is3LengthData(String inputData) {
        if (inputData.length() != 3) {
            throw new IllegalArgumentException("입력된 값이 3자리의 값이 아닙니다.");
        }
    }

    private void make3Ball(String inputData) {
        String[] numbers = inputData.split("");
        int ballIdx = 1;
        for (String number : numbers) {
            int ballNumber = Integer.parseInt(number);
            Ball ball = new Ball(ballNumber, ballIdx++);
            playerBalls.add(ball);
        }
    }

    private void printError(String message) {
        System.out.println("[ERROR] " + message);
    }

}
