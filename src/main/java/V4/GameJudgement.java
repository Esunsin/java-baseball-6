package V4;

import java.util.List;

public class GameJudgement {

    GameResult judge(List<BallV4> userBalls,List<BallV4> computerBalls){
        GameResult gameResult = new GameResult();

        for(BallV4 userBall : userBalls){
            if(isStrike(computerBalls, userBall)) gameResult.updateStrike();
            else if(isBall(computerBalls, userBall)) gameResult.updateBall();
            else continue;
        }
        return gameResult;
    }

    private boolean isBall(List<BallV4> computerBalls, BallV4 userBall) {
        return computerBalls.stream()
                .filter(it -> it.isBall(userBall)).count() > 0;
    }

    private boolean isStrike(List<BallV4> computerBalls, BallV4 userBall) {
        return computerBalls.stream()
                .filter(it -> userBall.equals(it)).count() > 0;
    }
}
