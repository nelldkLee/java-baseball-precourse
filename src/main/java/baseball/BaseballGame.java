package baseball;

import nextstep.utils.Console;

import java.util.ArrayList;

public class BaseballGame {

    private ArrayList<Ball> playerBalls;

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

    private boolean is3LengthData(String inputData) {
        if (inputData.length() != 3) {
            throw new IllegalArgumentException("The entered value is not 3 digits");
        }

        return true;
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
