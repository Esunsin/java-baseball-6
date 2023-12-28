package V2;

import java.util.List;

public class GameJudgement {

    public GameResult judge(List<Ball> userBalls, List<Ball> computerBall) {
        //같은 숫자이면서, 위치가 같으면 strike
        //같은 숫자이면서, 위치가 다르면 ball
        //나머지 out

        GameResult gameResult = new GameResult();

        for (Ball userBall : userBalls) {
            if (isStrike(userBall, computerBall)) {
                gameResult.updateOneStrike();
            } else if (isBall(userBall, computerBall)) {
                gameResult.updateOneBall();
            } else {
                gameResult.updateOneOut();
            }
        }
        System.out.println("strike " + gameResult.strikeCount + " ball " + gameResult.ballCount + " out " +gameResult.outCount);
        return gameResult;

    }

    private boolean isBall(Ball userBall , List<Ball> computerBall) {
        return computerBall.stream()
                .filter(it -> it.isBall(userBall)).count() > 0;
    }

    private boolean isStrike(Ball userBall, List<Ball> computerBall) {
        return computerBall.stream()
                .filter(it -> userBall.isSameBall(it)).count() > 0;
    }

}
