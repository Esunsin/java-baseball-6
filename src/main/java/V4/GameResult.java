package V4;

public class GameResult {
    private int strikeCount;
    private int ballCount;

    GameResult(){
        strikeCount = 0;
        ballCount = 0;
    }

    void updateStrike(){
        strikeCount++;
    }
    void updateBall(){
        ballCount++;
    }

    int printGameResult(){
        if(strikeCount<=0 && ballCount <= 0) System.out.println("낫싱");
        else if(strikeCount <= 0) System.out.println(ballCount + "볼");
        else if(ballCount <= 0) System.out.println(strikeCount + "스트라이크");
        else System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");

        return strikeCount;
    }

}
