package V4;

import V2.InputVaildator;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameStarter {
    private final InputVaildatorV4 inputVaildator;

    public GameStarter(InputVaildatorV4 inputVaildator) {
        this.inputVaildator = inputVaildator;
    }

    void start(){
        System.out.println("숫자 게임을 시작합니다.");
        Scanner scanner = new Scanner(System.in);
        BallMaker ballMaker = new BallMaker();
        List<Integer> computer = new ArrayList<>();
        while(true) {
            int gameLevel = 3;
            //computer number 생성
            while (computer.size() < gameLevel) {
                int randomNumber = Randoms.pickNumberInRange(1, 9);
                if (!computer.contains(randomNumber)) {
                    computer.add(randomNumber);
                }
            }
            //computerBall create
            List<BallV4> computerBalls = ballMaker.createBall(computer);
            for (BallV4 computerBall : computerBalls) {
                System.out.println(computerBall.toString());
            }
            //user number create
            System.out.print("숫자를 입력해주세요 : ");
            String user = scanner.next();

            inputVaildator.validate(user,computer);

            List<Integer> userNumber = new ArrayList<>();
            for(int i = 0 ; i < gameLevel ; i++){
                userNumber.add(Integer.valueOf(user.charAt(i)) - '0');
            }

            //userBall create
            List<BallV4> userBalls = ballMaker.createBall(userNumber);

            GameJudgement gameJudgement = new GameJudgement();
            GameResult gameResult = gameJudgement.judge(userBalls, computerBalls);

            int strikeCount = gameResult.printGameResult();
            //재시작 여부
            if(strikeCount == gameLevel) {
                System.out.println(gameLevel + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int restart = scanner.nextInt();
                if(restart == 2){
                    break;
                }
                else computer.clear();
            }
        }
    }
}
