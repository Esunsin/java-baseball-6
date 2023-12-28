package V2;

public class Application {
    public static void main(String[] args) {
        InputVaildator inputVaildator = new InputVaildator();
        BaseBallGameStarter baseBallGameStarter = new BaseBallGameStarter(inputVaildator);
        System.out.println("숫자 야구 게임을 시작합니다.");
        baseBallGameStarter.start();
    }
}
