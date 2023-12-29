package V4;

public class BallV4 {
    private int number;
    private int index;

    @Override
    public String toString() {
        return "BallV4{" +
                "number=" + number +
                ", index=" + index +
                '}';
    }

    BallV4(int number, int index){
        this.number = number;
        this.index = index;
    }
    boolean isBall(BallV4 target){
        return this.number == target.number && this.index != target.index;
    }


}
