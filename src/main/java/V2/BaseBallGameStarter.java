package V2;

import java.util.List;
import java.util.Scanner;

public class BaseBallGameStarter  {

    private final InputVaildator inputVaildator;

    public BaseBallGameStarter(InputVaildator inputVaildator) {
        this.inputVaildator = inputVaildator;
    }

    public void start() {
        BallMaker ballMaker = new BallMaker();
        Scanner scanner = new Scanner(System.in);
        List<Ball> computerBalls = ballMaker.makeComputerBalls();

        while(true) {
            System.out.println(computerBalls.get(0).toString() + computerBalls.get(1).toString()+computerBalls.get(2).toString());
            System.out.print("숫자를 입력해 주세요 : ");
            int input = scanner.nextInt();
            inputVaildator.validate(input);


            List<Ball> userBalls = ballMaker.makeUserBalls(input);
            System.out.println(userBalls.get(0).toString() + userBalls.get(1).toString()+userBalls.get(2).toString());

            GameJudgement gameJudgement = new GameJudgement();
            GameResult gameResult = gameJudgement.judge(userBalls, computerBalls);

            System.out.println(gameResult.strikeCount+"스트라이크 " + gameResult.ballCount+"볼");
            //게임 새로 시작
            if(gameResult.strikeCount==3){

                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int a = scanner.nextInt();
                if(a == 1){
                    computerBalls = ballMaker.makeComputerBalls();
                }
                else {//
                    break;
                }
            }
        }
    }
}
