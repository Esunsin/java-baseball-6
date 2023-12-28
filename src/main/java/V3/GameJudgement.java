package V3;

public class GameJudgement
{
    public GameResult judge(BallV3 computerBall,BallV3 userBall){
        GameResult gameResult = new GameResult();
        if(computerBall.getFirst() == userBall.getFirst()) gameResult.isStrike();
        else if(computerBall.getFirst() == userBall.getSecond() || computerBall.getFirst() == userBall.getThird()) gameResult.isBall();
        else gameResult.isOut();

        if(computerBall.getSecond() == userBall.getSecond()) gameResult.isStrike();
        else if(computerBall.getSecond() == userBall.getFirst() || computerBall.getSecond() == userBall.getThird()) gameResult.isBall();
        else gameResult.isOut();

        if(computerBall.getThird() == userBall.getThird()) gameResult.isStrike();
        else if(computerBall.getThird() == userBall.getSecond() || computerBall.getFirst() == userBall.getThird()) gameResult.isBall();
        else gameResult.isOut();

        return gameResult;
    }
}
