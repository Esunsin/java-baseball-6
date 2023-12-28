package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 야구 게임을 시작합니다.");
        List<Integer> computer = new ArrayList<>();
        while (true) {
            while (computer.size() < 3) {
                int randomNumber = Randoms.pickNumberInRange(1, 9);
                if (!computer.contains(randomNumber)) {
                    computer.add(randomNumber);
                }
            }
            //System.out.println(computer.get(0)+""+ computer.get(1)+""+computer.get(2));
            System.out.print("숫자를 입력해 주세요 : ");
            int number = scanner.nextInt();

            //예외처리
            if(number<100||number>999) exceptionMethod();

            List<Integer> temp = new ArrayList<>();
            temp.add(number / 100);
            temp.add(number / 10 % 10);
            temp.add(number % 10);

            int[] inputNumber = arrToList3(temp);
            int[] computerProgramBall = arrToList3(computer);

            //스트라이크 볼 판단
            int[] strikeAndBall = strikeAndBallCount(computerProgramBall,inputNumber);
            //출력
            printStrikeAndBall(strikeAndBall);

            if (strikeAndBall[0] == 3) {
                System.out.println(strikeAndBall[0] + "스트라이크");
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int restart = scanner.nextInt();
                if (restart == 1) {
                    computer.clear();
                } //재시작
                else break;
            }
        }
        return;
    }

    static void printStrikeAndBall(int[] count){
        if (count[1] > 0 && count[0] > 0)
            System.out.println(count[1] + "볼 " + count[0] + "스트라이크");
        else if (count[1] > 0 && count[0] <= 0)
            System.out.println(count[1] + "볼");
        else if (count[1] <= 0 && count[0] > 0 &&count[0]!=3)
            System.out.println(count[0] + "스트라이크");
        else
            System.out.println("낫싱");
    }

    static int[] strikeAndBallCount(int[] computerProgramBall,int[] inputNumber){
        int[] count = {0,0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (inputNumber[i] == computerProgramBall[j] && i == j) {
                    count[0]++;
                } else if (inputNumber[i] == computerProgramBall[j]) {
                    count[1]++;
                }
            }
        }
        return count;
    }

    static void exceptionMethod(){
        throw new IllegalArgumentException();
    }

    static int[] arrToList3(List<Integer> list){
        int[] temp = new int[3];
        temp[0] = list.get(0);
        temp[1] = list.get(1);
        temp[2] = list.get(2);

        return temp;
    }

    static void printTest(int[] arr){
        for(int i = 0 ;i< arr.length;i++){
            System.out.println("arr[i] = " + arr[i]);
        }
    }

}
