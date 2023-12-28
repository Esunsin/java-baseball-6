package V2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseBallGameStarter {

    public void start() {
        BallMaker ballMaker = new BallMaker();
        Scanner scanner = new Scanner(System.in);
        List<Ball> computerBalls = ballMaker.makeComputerBalls();
        while(true) {
            System.out.print("숫자를 입력해 주세요 : ");
            int input = scanner.nextInt();
            List<Ball> userBalls = ballMaker.makeUserBalls(input);

            GameJudgement gameJudgement = new GameJudgement();
            GameResult gameResult = gameJudgement.judge(userBalls, computerBalls);

            System.out.println(gameResult.strikeCount+"스트라이크 " + gameResult.ballCount+"볼");

            if(gameResult.strikeCount==3){
                int a = 0;
                if(a == 1){
                    computerBalls = ballMaker.makeComputerBalls();
                }
                break;
            }
        }
    }
}
