package V4;

public class Application {
    public static void main(String[] args) {
        InputVaildatorV4 inputVaildatorV4 = new InputVaildatorV4();
        GameStarter gameStarter = new GameStarter(inputVaildatorV4);
        gameStarter.start();
    }
}
