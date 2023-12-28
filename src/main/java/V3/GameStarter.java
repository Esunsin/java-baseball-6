package V3;

import V2.BallMaker;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameStarter {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> computer = new ArrayList<>();
        GameException gameException = new GameException();
        GamePrinter gamePrinter = new GamePrinter();
        //game start
        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true){
            while (computer.size() < 3) {
                int randomNumber = Randoms.pickNumberInRange(1, 9);
                if (!computer.contains(randomNumber)) {
                    computer.add(randomNumber);
                }

            }
            BallV3 computerBall = new BallV3(computer.get(0),computer.get(1),computer.get(2));
            gamePrinter.printBall(computerBall);
            //user
            System.out.print("숫자를 입력해 주세요 : ");
            int number = scanner.nextInt();
            gameException.illegalArgumentException(number);
            BallV3 userBall = new BallV3(number / 100, number / 10 % 10, number % 10);
            gamePrinter.printBall(userBall);
            //game
            GameJudgement gameJudgement = new GameJudgement();
            GameResult gameResult = gameJudgement.judge(computerBall, userBall);

            gamePrinter.printGameResult(gameResult);

            if(gameResult.strikeCount == 3){
                System.out.println(gameResult.strikeCount + "스트라이크");
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int restart = scanner.nextInt();
                if (restart == 1) {
                    computer.clear();
                } //재시작
                else break;
            }

        }

    }


}
