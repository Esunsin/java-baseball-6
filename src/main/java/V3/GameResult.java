package V3;

public class GameResult {
    int strikeCount = 0;
    int ballCount = 0;
    int outCount = 0;

    public void isStrike(){
        strikeCount++;
    }
    public void isBall(){
        ballCount++;
    }
    public void isOut(){
        outCount++;
    }
}
