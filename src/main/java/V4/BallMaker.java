package V4;

import java.util.ArrayList;
import java.util.List;

public class BallMaker {

    public List<BallV4> createBall(List<Integer> numbers){
        List<BallV4> balls = new ArrayList<>();
        int gameLevel = numbers.size();
        for(int order = 0 ; order < gameLevel ; order++){
            BallV4 ballV4 = new BallV4(numbers.get(order),order);
            balls.add(ballV4);
        }
        return balls;
    }
}
