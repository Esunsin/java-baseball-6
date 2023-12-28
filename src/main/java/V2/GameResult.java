package V2;

public class GameResult {

    int strikeCount;
    int ballCount;
    int outCount;

    GameResult() {
        strikeCount = 0;
        ballCount = 0;
        outCount = 0;
    }

    public void updateOneStrike() {
        strikeCount++;
    }

    public void updateOneBall() {
        ballCount++;
    }


    public void updateOneOut() {
        outCount++;
    }

}
