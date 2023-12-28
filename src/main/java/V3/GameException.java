package V3;


public class GameException {
    void illegalArgumentException(int number){
        if(number < 100|| number > 999) {
            throw new IllegalArgumentException();
        }
    }
}
