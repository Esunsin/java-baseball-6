package V2;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BallMaker {

    public List<Ball> makeComputerBalls() {


        List<Integer> randoNumbers = createRandoNumbers();
        List<Ball> balls = makeBall(randoNumbers);

        return balls;
    }

    private List<Integer> createRandoNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public List<Ball> makeUserBalls(int number) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number/100);
        numbers.add(number/10%10);
        numbers.add(number%10);
        List<Ball> list = makeBall(numbers);
        return list;
    }

    private List<Ball> makeBall(List<Integer> randomNumbers){
        List<Ball> list= new ArrayList<>();
        for(int order = 0 ; order < randomNumbers.size() ; order++){
            Ball ball = new Ball(randomNumbers.get(order), order);
            list.add(ball);
        }
        return list;
    }

}
