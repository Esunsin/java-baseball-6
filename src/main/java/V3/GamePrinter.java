package V3;

public class GamePrinter {
    void printBall(BallV3 Ball) {
        System.out.println(Ball.getFirst() + "" + Ball.getSecond() + "" + Ball.getThird());
    }

    void printGameResult(GameResult gameResult) {
        if (gameResult.ballCount > 0 && gameResult.strikeCount > 0)
            System.out.println(gameResult.ballCount + "볼 " + gameResult.strikeCount + "스트라이크");
        else if (gameResult.ballCount > 0 && gameResult.strikeCount <= 0)
            System.out.println(gameResult.ballCount + "볼");
        else if (gameResult.ballCount <= 0 && gameResult.strikeCount > 0 && gameResult.strikeCount!=3)
            System.out.println(gameResult.strikeCount + "스트라이크");
        else
            System.out.println("낫싱");
    }
}
